package Uf1_Estructurada.ciclos;

import java.util.Scanner;

/**
 * Esta clase permite al usuario ingresar números y determina si son positivos o negativos.
 * El programa continúa solicitando números hasta que se ingresa un número negativo.
 */
public class EjercicioDosLecturaNumero {

    public static void main(String[] args) {

        // Crear un objeto Scanner para recibir entrada del usuario
        Scanner Entrada = new Scanner(System.in);

        int numero = 0; // Inicializar la variable 'numero'

        do {
            // Pedir al usuario que ingrese un número
            System.out.println("ingrese el numero ");
            numero = Entrada.nextInt(); // Leer el número ingresado

            // Verificar si el número es positivo o negativo
            if (numero >= 0) {
                System.out.println("Numero positivo " + numero);
            } else {
                System.out.println("Numero negativo " + numero);
            }

            // Repetir el bucle mientras el número sea mayor o igual a 0
        } while (numero >= 0);

        // Cerrar el objeto Scanner (buena práctica)
        Entrada.close();
    }
}
