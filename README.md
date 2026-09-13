# Tic Tac Toe en Java

Este proyecto implementa una version del clasico juego de Tres en Raya (Tic Tac Toe) mediante el lenguaje Java, utilizando la biblioteca javax.swing para el renderizado de la interfaz grafica. Se ha diseñado siguiendo un modelo de separacion de responsabilidades, dividiendo la logica de negocio de los componentes visuales.

## Caracteristicas del Sistema

- **Arquitectura Desacoplada**: La gestion del estado del juego y el renderizado UI estan divididos en clases independientes (`JuegoLogica` y `TICTACTOE`).
- **Sistema de Torneo (Mejor de N)**: Soporte para configurar una serie de partidas (1, 3, 5, 7 rondas). El estado se mantiene a lo largo de las rondas hasta declarar un campeon definitivo.
- **Registro de Jugadores**: Permite la entrada de identificadores (nombres) para los dos participantes.
- **Modos de Asignacion de Fichas**:
  - *Asignacion Fija*: El Jugador 1 es asignado permanentemente a la ficha 'X' y el Jugador 2 a la ficha 'O'.
  - *Eleccion Libre (Rotativa)*: Se solicita al inicio de cada ronda que los participantes decidan el mapeo de sus identidades respecto a las fichas 'X' y 'O'.
- **Graficos Vectoriales**: Las fichas son renderizadas utilizando fuentes nativas del sistema, garantizando alta resolucion y ausencia de pixelacion sin dependencia de recursos de mapa de bits (imagenes externas).
- **Interfaz Reactiva**: Actualizacion de componentes Swing en tiempo real para indicar el turno activo y el marcador del torneo.

## Requisitos del Entorno

- Java Development Kit (JDK) 8 o superior.
- Entorno de construccion (IDE como IntelliJ IDEA, Eclipse, NetBeans) o compilacion manual mediante `javac`.

## Instrucciones de Construccion y Ejecucion

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/AcuLuis/TicTacToe.git
   ```

2. **Compilacion (Linea de Comandos)**:
   Ubicarse en la raiz del proyecto y compilar los archivos fuente especificando el directorio de salida:
   ```bash
   javac -d build/classes src/JUEGO/*.java
   ```

3. **Ejecucion**:
   Ejecutar la clase principal desde el directorio compilado:
   ```bash
   java -cp build/classes JUEGO.TICTACTOE
   ```

## Estructura del Proyecto

- `src/JUEGO/TICTACTOE.java`: Clase principal y Controlador de Vistas. Gestiona los eventos de usuario, renderiza el JFrame y despliega dialogos de configuracion (JOptionPane).
- `src/JUEGO/JuegoLogica.java`: Modelo de datos. Contiene la logica de evaluacion de la matriz (3x3), el control de los turnos, validacion de victorias parciales y estado global del torneo.

## Licencia

Este proyecto esta sujeto a la licencia MIT. Consulte el archivo `LICENSE` proporcionado en el repositorio para obtener los detalles correspondientes.