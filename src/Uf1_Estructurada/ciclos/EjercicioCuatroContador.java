package Uf1_Estructurada.ciclos;

import java.util.Scanner;

/**
 * Esta clase permite al usuario ingresar números y determina si son negativos o positivos.
 * Lleva un contador de cuántos números se han ingresado en total y cuántos se ingresaron antes de un número negativo.
 */
public class EjercicioCuatroContador {

    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir entrada del usuario
        Scanner Entrada = new Scanner(System.in);

        int numero = 0; // Inicializar la variable 'numero'
        int contador = 0; // Inicializar el contador

        do {
            // Pedir al usuario que ingrese un número
            System.out.println("ingrese su numero para ver si es negativo o no ");
            numero = Entrada.nextInt(); // Leer el número ingresado

            contador++; // Incrementar el contador de números ingresados

            // Verificar si el número es positivo o negativo
            if (numero >= 0) {
                System.out.println("numero " + numero + " positivo");
            } else {
                System.out.println("numero " + numero + " negativo");
            }

            // Repetir el bucle mientras el número ingresado sea mayor o igual a 0
        } while (numero >= 0);

        // Mostrar el total de números ingresados y los números antes del negativo
        System.out.println("Se ingresaron " + contador + " numeros en total ");
        System.out.println("Se ingresaron " + (contador - 1) + " numeros antes del numero negativo  ");

        // Cerrar el objeto Scanner (buena práctica)
        Entrada.close();
    }
}
