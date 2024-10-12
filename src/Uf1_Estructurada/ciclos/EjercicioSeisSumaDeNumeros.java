package Uf1_Estructurada.ciclos;

import java.util.Scanner;

/**
 * Esta clase contiene un programa que suma números ingresados por el usuario
 * hasta que el usuario introduce 0, que es la señal para terminar la entrada.
 */
public class EjercicioSeisSumaDeNumeros {

    public static void main(String[] args) {

        // Inicializa el escáner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Variables para almacenar el número ingresado y la suma total
        int numero = 0;
        int suma = 0;

        do {
            // Solicita al usuario que ingrese un número o 0 para salir
            System.out.println("Ingrese el número o 0 para salir: ");
            numero = entrada.nextInt();

            // Si el número es 0, informa al usuario que no se sumará
            if (numero == 0) {
                System.out.println("Este número no suma nada.");
            } else {
                // Suma el número ingresado a la suma total
                suma = suma + numero;
                System.out.println("Número sumado con éxito.");
            }

        } while (numero != 0); // El bucle continúa hasta que se ingresa 0

        // Muestra la suma total de todos los números ingresados
        System.out.println("La suma de todos los números es: " + suma);

        // Cierra el escáner para liberar recursos
        entrada.close();
    }
}
