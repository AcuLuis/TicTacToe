package JUEGO;

public class JuegoLogica {
    public static final int VACIO = 2;
    public static final int EQUIS = 0;
    public static final int CIRCULO = 1;

    public static final int ESTADO_JUGANDO = 0;
    public static final int ESTADO_GANA_EQUIS = 1;
    public static final int ESTADO_GANA_CIRCULO = 2;
    public static final int ESTADO_EMPATE = 3;

    private int[][] matriz;
    private int turno; // EQUIS o CIRCULO
    private int movimientos;

    // Torneo
    private String nombreJ1 = "Jugador 1";
    private String nombreJ2 = "Jugador 2";
    private int victoriasJ1;
    private int victoriasJ2;
    private int totalRondas;
    private int rondasJugadas;
    private boolean modoFijo = true;
    private int jugadorXActual = 1; // 1 = J1, 2 = J2

    public JuegoLogica() {
        matriz = new int[3][3];
        totalRondas = 1; // Por defecto es 1 ronda
        iniciarTorneo(totalRondas);
    }
    
    public void iniciarTorneo(int rondas, String n1, String n2, boolean fijo) {
        this.totalRondas = rondas;
        this.nombreJ1 = (n1 != null && !n1.trim().isEmpty()) ? n1 : "Jugador 1";
        this.nombreJ2 = (n2 != null && !n2.trim().isEmpty()) ? n2 : "Jugador 2";
        this.modoFijo = fijo;
        this.victoriasJ1 = 0;
        this.victoriasJ2 = 0;
        this.rondasJugadas = 0;
        
        if (this.modoFijo) {
            this.jugadorXActual = 1;
        }
        iniciarJuego();
    }
    
    // Método temporal por compatibilidad si se llamase al anterior
    public void iniciarTorneo(int rondas) {
        iniciarTorneo(rondas, "Jugador 1", "Jugador 2", true);
    }

    public void iniciarJuego() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = VACIO;
            }
        }
        movimientos = 0;
        turno = EQUIS; // Por defecto
    }

    public void setTurno(int turnoInicial) {
        this.turno = turnoInicial;
    }

    public int getTurno() {
        return turno;
    }

    // Retorna true si el movimiento fue válido y se registró
    public boolean hacerMovimiento(int fila, int col) {
        if (matriz[fila][col] == VACIO && verificarEstado() == ESTADO_JUGANDO) {
            matriz[fila][col] = turno;
            movimientos++;
            if (verificarEstado() == ESTADO_JUGANDO) {
                // Cambiar turno
                turno = (turno == EQUIS) ? CIRCULO : EQUIS;
            }
            return true;
        }
        return false;
    }

    public int verificarEstado() {
        // Revisar filas
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] != VACIO && matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
                return (matriz[i][0] == EQUIS) ? ESTADO_GANA_EQUIS : ESTADO_GANA_CIRCULO;
            }
        }
        // Revisar columnas
        for (int j = 0; j < 3; j++) {
            if (matriz[0][j] != VACIO && matriz[0][j] == matriz[1][j] && matriz[1][j] == matriz[2][j]) {
                return (matriz[0][j] == EQUIS) ? ESTADO_GANA_EQUIS : ESTADO_GANA_CIRCULO;
            }
        }
        // Revisar diagonales
        if (matriz[0][0] != VACIO && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
            return (matriz[0][0] == EQUIS) ? ESTADO_GANA_EQUIS : ESTADO_GANA_CIRCULO;
        }
        if (matriz[0][2] != VACIO && matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
            return (matriz[0][2] == EQUIS) ? ESTADO_GANA_EQUIS : ESTADO_GANA_CIRCULO;
        }

        // Revisar empate
        if (movimientos == 9) {
            return ESTADO_EMPATE;
        }

        return ESTADO_JUGANDO;
    }

    public void setJugadorXActual(int jugador) {
        this.jugadorXActual = jugador;
    }

    public void registrarVictoria(int ganador) {
        if (ganador == EQUIS) {
            if (jugadorXActual == 1) victoriasJ1++;
            else victoriasJ2++;
        } else if (ganador == CIRCULO) {
            if (jugadorXActual == 1) victoriasJ2++;
            else victoriasJ1++;
        }
        rondasJugadas++;
    }

    public void registrarEmpate() {
        rondasJugadas++;
    }

    public boolean torneoFinalizado() {
        int rondasRestantes = totalRondas - rondasJugadas;
        if (rondasRestantes == 0) return true;
        if (Math.abs(victoriasJ1 - victoriasJ2) > rondasRestantes) return true;
        return false;
    }

    public int getCampeon() {
        if (victoriasJ1 > victoriasJ2) return 1; // Campeón J1
        if (victoriasJ2 > victoriasJ1) return 2; // Campeón J2
        return VACIO; // Empate en torneo
    }

    public String getNombre(int equipo) {
        if (equipo == EQUIS) {
            return (jugadorXActual == 1) ? nombreJ1 : nombreJ2;
        } else if (equipo == CIRCULO) {
            return (jugadorXActual == 1) ? nombreJ2 : nombreJ1;
        }
        return "";
    }
    
    public String getNombreJ1() { return nombreJ1; }
    public String getNombreJ2() { return nombreJ2; }
    public int getVictoriasJ1() { return victoriasJ1; }
    public int getVictoriasJ2() { return victoriasJ2; }
    public int getVictoriasEquis() { return (jugadorXActual == 1) ? victoriasJ1 : victoriasJ2; }
    public int getVictoriasCirculo() { return (jugadorXActual == 1) ? victoriasJ2 : victoriasJ1; }
    public int getRondasJugadas() { return rondasJugadas; }
    public int getTotalRondas() { return totalRondas; }
    public boolean isModoFijo() { return modoFijo; }
}
