/**
 * Esta clase permite al usuario ingresar un número y calcula su cuadrado.
 * Utiliza un bucle do-while para permitir múltiples entradas hasta que se ingrese un número negativo.
 */
package Uf1_Estructurada.ciclos;

import java.util.Scanner;

public class EjercicioUnoElCuadradoNumero {

    public static void main (String [] strg){

        // Crear un objeto Scanner para recibir entrada del usuario
        Scanner Entrada = new Scanner(System.in);
        int numero = 0; // Inicializar la variable 'numero'

        do {
            // Pedir al usuario que ingrese un número
            System.out.println("ingrese el numero para saber el valor de su cuadrado ");
            numero = Entrada.nextInt(); // Leer el número ingresado

            // Calcular el cuadrado del número
            int cuadrado = (int)Math.pow(numero, 2);

            // Mostrar el resultado
            System.out.println("el cuadrado del numero " + numero + " es " + cuadrado);

            // Repetir el bucle mientras el número sea mayor o igual a 0
        } while (numero >= 0);

        // Cerrar el objeto Scanner (buena práctica)
        Entrada.close();
    }
}

