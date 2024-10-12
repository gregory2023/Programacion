package Uf1_Estructurada.ciclos;

import java.util.Scanner;

/**
 * Esta clase permite al usuario ingresar números y determina si son pares o impares.
 * El programa continúa solicitando números hasta que se ingresa el número 0.
 */
public class EjercicioTresNumerosPares {

    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir entrada del usuario
        Scanner Entrada = new Scanner(System.in);

        int numero = 0; // Inicializar la variable 'numero'

        do {
            // Pedir al usuario que ingrese un número
            System.out.println("ingrese el numero para saber si es par o no");
            numero = Entrada.nextInt(); // Leer el número ingresado

            // Verificar si el número es par o impar
            if (numero % 2 == 0) {
                System.out.println("numero " + numero+ " par ");
            } else {
                System.out.println("numero " + numero + " impar");
            }
            // Repetir el bucle mientras el número ingresado no sea 0
        } while (numero != 0);

        // Cerrar el objeto Scanner (buena práctica)
        Entrada.close();
    }
}
