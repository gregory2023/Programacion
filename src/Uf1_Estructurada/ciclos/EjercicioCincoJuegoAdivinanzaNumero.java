package Uf1_Estructurada.ciclos;

import java.util.Scanner;

/**
 * Esta clase implementa un juego de adivinanza de números.
 * El usuario debe adivinar un número aleatorio entre 0 y 99,
 * y el programa proporciona pistas sobre si el número ingresado es mayor o menor.
 */
public class EjercicioCincoJuegoAdivinanzaNumero {

    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir entrada del usuario
        Scanner Entrada = new Scanner(System.in);

        int numero; // Variable para almacenar el número ingresado por el usuario
        int aleatorio; // Variable para almacenar el número aleatorio
        int contador = 0; // Inicializar el contador de intentos

        // Generar un número aleatorio entre 0 y 99
        aleatorio = (int)(Math.random() * 100);
        // System.out.println(aleatorio); // Descomentar para ver el número aleatorio

        System.out.println("Hola vamos a jugar a adivinar el numero!!");

        do {
            // Pedir al usuario que ingrese un número
            System.out.println("ingresa el numero que creas que es :) ");
            numero = Entrada.nextInt(); // Leer el número ingresado

            // Comparar el número ingresado con el número aleatorio
            if (numero == aleatorio) {
                System.out.println("Muy bieeen crak lo has adivinado, El numero es " + aleatorio);
                contador++; // Incrementar el contador en caso de adivinar
            } else if (numero > aleatorio) {
                System.out.println("Intentalo de nuevo");
                System.out.println("PISTA ---> El numero es menor al que ingresaste");
                contador++; // Incrementar el contador en caso de no adivinar
            } else {
                System.out.println("Intentalo de nuevo");
                System.out.println("PISTA ---> El numero es mayor al que ingresaste");
                contador++; // Incrementar el contador en caso de no adivinar
            }
        } while (numero != aleatorio); // Continuar hasta que el usuario adivine el número

        // Mostrar el número total de intentos realizados
        System.out.println("El numero de intentos fue : " + contador + " veces gracias por jugar");

        // Cerrar el objeto Scanner (buena práctica)
        Entrada.close();
    }
}

