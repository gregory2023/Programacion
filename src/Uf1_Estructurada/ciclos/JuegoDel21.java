package Uf1_Estructurada.ciclos;

import java.util.Scanner;

/**
 * JuegoDel21 es un juego en el que el jugador trata de alcanzar una suma de 21
 * puntos con cartas aleatorias generadas por la máquina. Si el jugador alcanza 21, gana;
 * si supera 21, pierde.
 */
public class JuegoDel21 {

    public static void main(String[] args){
        // Objeto Scanner para capturar la entrada del usuario.
        Scanner Entrada = new Scanner(System.in);

        // Variables de control del juego
        int numeroMaquina = 0;   // Número aleatorio generado para cada carta.
        int suma = 0;            // Suma acumulada de los valores de las cartas del jugador.
        String decision;         // Almacena la decisión del jugador ("si" o "no").
        int contador = 1;        // Cuenta cuántas cartas ha pedido el jugador.

        // Generación de la primera carta de manera aleatoria.
        numeroMaquina = (int)(Math.random() * 10) + 1;

        // Muestra el inicio del juego y el valor de la primera carta.
        System.out.println("INICIEMOS EL JUEGO DEL 21 !!");
        System.out.println("Primera carta tiene un valor de " + numeroMaquina);

        // Suma el valor de la primera carta al total acumulado.
        suma = suma + numeroMaquina;

        // Bucle que permite al jugador pedir más cartas o plantarse.
        do {

                // Pregunta al jugador si quiere otra carta.
                System.out.println("¿Quieres otra carta? (si/no)");
                decision = Entrada.nextLine().toLowerCase();  // Captura la decisión del usuario.

            while (!decision.equals("si") && !decision.equals("no")){
                System.out.println("ingrese 'si' o 'no' por favor ");
                decision = Entrada.nextLine().toLowerCase();
            }

            // Si el jugador decide pedir otra carta:
            if (decision.equals("si")) {
                // Genera otra carta aleatoria y la suma al total acumulado.
                numeroMaquina = (int)(Math.random() * 11) + 1;
                suma = suma + numeroMaquina;

                // Muestra el valor de la nueva carta y el total acumulado hasta el momento.
                System.out.println("El valor de la siguiente carta es de " + numeroMaquina);
                System.out.println("Llevas un valor de " + suma);

                // Incrementa el contador de cartas solicitadas.
                contador++;
            } else {
                // Si el jugador decide no pedir más cartas, la decisión se ajusta a "no".
                decision = "no";
            }

            // Si el jugador ha alcanzado exactamente 21 puntos, gana automáticamente.
            if (suma == 21) {
                System.out.println("¡Has ganado!");
                System.out.println("Suma total: " + suma);
                break;
            }

            // El bucle se repite mientras la suma no supere 21 y el jugador quiera otra carta.
        } while (suma <= 21 && decision.equals("si"));

        // Si el jugador supera 21 puntos, pierde.
        if (suma >= 22) {

            System.out.println("Lo siento, has perdido.");
            System.out.println("Perdiste en la carta número " + contador);
        } else {
            // Si el jugador se planta sin pasarse, muestra el total y la cantidad de cartas solicitadas.
            System.out.println("Te plantaste con un valor de " + suma);
            System.out.println("Pediste un total de " + contador + " cartas.");
        }

        // Cierra el scanner al final del programa para evitar problemas de recursos abiertos.
        Entrada.close();
    }
}
