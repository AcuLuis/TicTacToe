
package JUEGO;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TICTACTOE extends javax.swing.JFrame {
    
    JuegoLogica logica;
    javax.swing.JButton[][] botonesMatriz;

    public TICTACTOE() {
        initComponents();
        logica = new JuegoLogica();
        
        botonesMatriz = new javax.swing.JButton[][]{
            {btn_uno, btn_dos, btn_tres},
            {btn_cuatro, btn_cinco, btn_seis},
            {btn_siete, btn_ocho, btn_nueve}
        };
        
        aplicarEstilos();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botonesMatriz[i][j].setEnabled(false);
            }
        }
        
        this.btn_circulo.setEnabled(true);
        this.btn_equis.setEnabled(true);
        actualizarTitulo();
    }
    
    private void aplicarEstilos() {
        // Centrar y color de fondo
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(45, 45, 45));
        
        java.awt.Font fuenteGrande = new java.awt.Font("Arial", java.awt.Font.BOLD, 80);
        // Estilos para el tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botonesMatriz[i][j].setBackground(new Color(240, 240, 240));
                botonesMatriz[i][j].setFocusPainted(false);
                botonesMatriz[i][j].setBorderPainted(false);
                botonesMatriz[i][j].setFont(fuenteGrande);
                botonesMatriz[i][j].setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        }
        
        // Estilos para botones de control
        btn_reset1.setBackground(new Color(220, 53, 69));
        btn_reset1.setForeground(Color.WHITE);
        btn_reset1.setFocusPainted(false);
        btn_reset1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn_equis.setBackground(new Color(0, 123, 255));
        btn_equis.setForeground(Color.WHITE);
        btn_equis.setFocusPainted(false);
        btn_equis.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn_circulo.setBackground(new Color(40, 167, 69));
        btn_circulo.setForeground(Color.WHITE);
        btn_circulo.setFocusPainted(false);
        btn_circulo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    private void actualizarTitulo() {
        String marcador = String.format(" | %s: %d - %s: %d | Ronda %d de %d", 
            logica.getNombreJ1(), logica.getVictoriasJ1(), 
            logica.getNombreJ2(), logica.getVictoriasJ2(), 
            Math.min(logica.getRondasJugadas() + 1, logica.getTotalRondas()), logica.getTotalRondas());
            
        if (!btn_uno.isEnabled() && btn_equis.isEnabled()) {
            this.setTitle("Tic Tac Toe - Esperando inicio" + marcador);
        } else {
            String nombreJugador = logica.getNombre(logica.getTurno());
            String simbolo = (logica.getTurno() == JuegoLogica.EQUIS) ? "X" : "O";
            this.setTitle("Tic Tac Toe - Turno de: " + nombreJugador + " (" + simbolo + ")" + marcador);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_uno = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_reset1 = new javax.swing.JButton();
        btn_equis = new javax.swing.JButton();
        btn_circulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("panel");

        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuatroActionPerformed(evt);
            }
        });

        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sieteActionPerformed(evt);
            }
        });

        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_reset1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_reset1.setText("RESET");
        btn_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset1ActionPerformed(evt);
            }
        });

        btn_equis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_equis.setText("X");
        btn_equis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equisActionPerformed(evt);
            }
        });

        btn_circulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_circulo.setText("O");
        btn_circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_circuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_equis, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btn_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_equis, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procesarClick(int fila, int col, javax.swing.JButton boton) {
        int turnoActual = logica.getTurno();
        if (logica.hacerMovimiento(fila, col)) {
            if (turnoActual == JuegoLogica.EQUIS) {
                boton.setText("X");
                boton.setForeground(new Color(0, 123, 255)); // Azul
            } else {
                boton.setText("O");
                boton.setForeground(new Color(40, 167, 69)); // Verde
            }
            boton.setEnabled(false);
            actualizarTitulo();
            verificarGanador();
        }
    }

    public void verificarGanador() {
        int estado = logica.verificarEstado();
        boolean rondaTerminada = false;
        
        if (estado == JuegoLogica.ESTADO_GANA_EQUIS) {
            String nombre = logica.getNombre(JuegoLogica.EQUIS);
            JOptionPane.showMessageDialog(this, "¡GANÓ " + nombre + " LA RONDA " + (logica.getRondasJugadas() + 1) + "!");
            logica.registrarVictoria(JuegoLogica.EQUIS);
            rondaTerminada = true;
        } else if (estado == JuegoLogica.ESTADO_GANA_CIRCULO) {
            String nombre = logica.getNombre(JuegoLogica.CIRCULO);
            JOptionPane.showMessageDialog(this, "¡GANÓ " + nombre + " LA RONDA " + (logica.getRondasJugadas() + 1) + "!");
            logica.registrarVictoria(JuegoLogica.CIRCULO);
            rondaTerminada = true;
        } else if (estado == JuegoLogica.ESTADO_EMPATE) {
            JOptionPane.showMessageDialog(this, "EMPATE EN LA RONDA " + (logica.getRondasJugadas() + 1));
            logica.registrarEmpate();
            rondaTerminada = true;
        }

        if (rondaTerminada) {
            if (logica.torneoFinalizado()) {
                anunciarCampeon();
            } else {
                this.resetea();
            }
        }
    }

    private void anunciarCampeon() {
        int campeon = logica.getCampeon();
        String mensaje = "El torneo ha terminado en empate.";
        if (campeon == 1) mensaje = "¡" + logica.getNombreJ1().toUpperCase() + " ES EL CAMPEÓN DEL TORNEO!";
        if (campeon == 2) mensaje = "¡" + logica.getNombreJ2().toUpperCase() + " ES EL CAMPEÓN DEL TORNEO!";
        
        JOptionPane.showMessageDialog(this, mensaje, "Fin del Torneo", JOptionPane.INFORMATION_MESSAGE);
        
        logica.iniciarTorneo(1, "Jugador 1", "Jugador 2", true);
        this.resetea();
    }
    
    private void btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuatroActionPerformed
        procesarClick(1, 0, btn_cuatro);
    }//GEN-LAST:event_btn_cuatroActionPerformed

    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        procesarClick(0, 0, btn_uno);
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sieteActionPerformed
        procesarClick(2, 0, btn_siete);
    }//GEN-LAST:event_btn_sieteActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        procesarClick(0, 1, btn_dos);
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
        procesarClick(0, 2, btn_tres);
    }//GEN-LAST:event_btn_tresActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        procesarClick(1, 1, btn_cinco);
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        procesarClick(1, 2, btn_seis);
    }//GEN-LAST:event_btn_seisActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        procesarClick(2, 1, btn_ocho);
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        procesarClick(2, 2, btn_nueve);
    }//GEN-LAST:event_btn_nueveActionPerformed
    public void resetea(){
        logica.iniciarJuego();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botonesMatriz[i][j].setEnabled(false);
                botonesMatriz[i][j].setIcon(null);
                botonesMatriz[i][j].setText("");
            }
        }
        
        this.btn_equis.setEnabled(true);
        this.btn_circulo.setEnabled(true);
        actualizarTitulo();
    }
    private void comprobarInicioTorneo() {
        if (logica.getRondasJugadas() == 0 && logica.getTotalRondas() == 1 && logica.getVictoriasJ1() == 0 && logica.getVictoriasJ2() == 0) {
            javax.swing.JTextField j1Field = new javax.swing.JTextField("Jugador 1");
            javax.swing.JTextField j2Field = new javax.swing.JTextField("Jugador 2");
            String[] modos = {"Asignación Fija (J1=X, J2=O)", "Elección libre por ronda"};
            javax.swing.JComboBox<String> modoBox = new javax.swing.JComboBox<>(modos);
            String[] rondas = {"1", "3", "5", "7"};
            javax.swing.JComboBox<String> rondaBox = new javax.swing.JComboBox<>(rondas);

            Object[] message = {
                "Nombre Jugador 1:", j1Field,
                "Nombre Jugador 2:", j2Field,
                "Modo de Asignación:", modoBox,
                "Rondas (Al mejor de):", rondaBox
            };

            int option = JOptionPane.showConfirmDialog(this, message, "Configuración del Torneo", JOptionPane.OK_CANCEL_OPTION);
            
            if (option == JOptionPane.OK_OPTION) {
                boolean fijo = modoBox.getSelectedIndex() == 0;
                int r = Integer.parseInt((String) rondaBox.getSelectedItem());
                logica.iniciarTorneo(r, j1Field.getText(), j2Field.getText(), fijo);
            } else {
                logica.iniciarTorneo(1, "Jugador 1", "Jugador 2", true);
            }
        }
    }

    private void btn_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset1ActionPerformed
        logica.iniciarTorneo(1, "Jugador 1", "Jugador 2", true);
        this.resetea();
    }//GEN-LAST:event_btn_reset1ActionPerformed

    private void asignarTurno(int turnoElegido) {
        comprobarInicioTorneo();
        
        if (!logica.isModoFijo()) {
            String[] opciones = {logica.getNombreJ1(), logica.getNombreJ2()};
            String strTurno = (turnoElegido == JuegoLogica.EQUIS) ? "X" : "O";
            int seleccion = JOptionPane.showOptionDialog(this, 
                "¿Quién jugará con la '" + strTurno + "' en esta ronda?", 
                "Elegir Equipo", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, opciones, opciones[0]);
                
            if (seleccion == 0) {
                logica.setJugadorXActual((turnoElegido == JuegoLogica.EQUIS) ? 1 : 2);
            } else {
                logica.setJugadorXActual((turnoElegido == JuegoLogica.EQUIS) ? 2 : 1);
            }
        } else {
            // En modo fijo, J1 siempre es X, J2 siempre es O
            logica.setJugadorXActual(1);
        }
        
        logica.setTurno(turnoElegido);
        iniciarBotones();
    }

    private void btn_equisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equisActionPerformed
        asignarTurno(JuegoLogica.EQUIS);
    }//GEN-LAST:event_btn_equisActionPerformed

    private void btn_circuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_circuloActionPerformed
        asignarTurno(JuegoLogica.CIRCULO);
    }//GEN-LAST:event_btn_circuloActionPerformed

    private void iniciarBotones() {
        this.btn_equis.setEnabled(false);
        this.btn_circulo.setEnabled(false);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botonesMatriz[i][j].setEnabled(true);
            }
        }
        actualizarTitulo();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACTOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_circulo;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_equis;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_reset1;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    // End of variables declaration//GEN-END:variables
}
