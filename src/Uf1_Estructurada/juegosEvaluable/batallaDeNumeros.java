package Uf1_Estructurada.juegosEvaluable;

public class batallaDeNumeros {

    // PUNTOS INICIALES DEL JUGADOR


// El jugador comienza con 1000 puntos

// COSTO POR RONDA
// Cada ronda cuesta 200 puntos

// RECOMPENSA POR GANAR UNA RONDA

// Si el jugador gana la ronda, obtiene 400 puntos

// VARIABLE PARA CONTROLAR EL USO DEL PODER "DOBLAR MÁQUINA"

// El poder "Doblar Máquina" solo se puede usar una vez por partida

// PODER "DOBLAR" (Jugador)£

// Este poder duplica el número del jugador
// Si el número resultante supera 11, el jugador pierde automáticamente la ronda

// PODER "DIVIDIR" (Jugador)

// Si el número del jugador es mayor que 5, se puede dividir entre 2 (redondeado hacia abajo)

// PODER "ROBO"

// Intercambia el número del jugador con el de la computadora

// PODER "DOBLAR MÁQUINA"

// Duplica el número de la computadora
// Si el número de la computadora supera 11 después de aplicar el poder, la computadora pierde automáticamente

// MECÁNICA DE LA RONDA

// 1. Se restan 200 puntos del total del jugador al iniciar la ronda
// 2. Se generan números aleatorios para el jugador y la computadora (entre 1 y 10)
// 3. El jugador puede elegir si usar uno de los poderes especiales
// 4. Se comparan los números (aplicando poderes si se usaron)
// 5. Si el número del jugador es mayor, gana la ronda y obtiene 400 puntos
// 6. Si el número de la computadora es mayor, el jugador no gana puntos en esa ronda
// 7. Si los puntos del jugador llegan a 0, el juego termina
// 8. El jugador puede optar por retirarse del juego en cualquier momento

}
