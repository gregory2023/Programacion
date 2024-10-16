package  Uf1_Estructurada.ciclos;

import java.util.Scanner;

/**
 * Esta clase calcula la media aritmética de una serie de números ingresados por el usuario.
 * El usuario puede ingresar números de manera repetida, y el programa calculará la suma y
 * la media de los números introducidos hasta que se ingrese un número negativo.
 * Una vez que se ingresa un número negativo, el ciclo se detiene y se muestra el
 * promedio, la suma y el número de intentos.
 */
public class EjercicioCieteMedia {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in); // Se crea el objeto Scanner para recibir entrada del usuario

        int numero; // Variable que almacenará el número ingresado por el usuario
        int suma = 0; // Variable para almacenar la suma de los números ingresados
        int contador = 0; // Contador de la cantidad de números ingresados

        do {
            contador++; // Incrementa el contador en cada iteración
            System.out.println("Ingrese el número por favor "); // Solicita al usuario que ingrese un número
            numero = Entrada.nextInt(); // Captura el número ingresado por el usuario

            suma = suma + numero; // Suma el número ingresado al total acumulado


        } while (numero >= 0); // El ciclo se repite hasta que el número ingresado sea negativo

        // Al finalizar el ciclo, se recalcula la media de los números ingresados
        double media = suma / contador;

        // Muestra los resultados
        System.out.println("La media de todos los números es " + media);
        System.out.println("La suma de todos los números es " + suma);
        System.out.println("El número de intentos ingresados fue de: " + contador);
    }
}
