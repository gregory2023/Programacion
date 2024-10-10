/**
 * El ejercicio consistirá en utilizar lo explicado en la Unidad Formativa para realizar una aplicación que realice la siguiente secuencia de acciones:
 *
 * 1.	La aplicación pedirá al usuario que introduzca por consola una palabra.
 * 2.	Una vez introducida el sistema calculará la longitud de la pantalla
 * 3.	Dependiendo del resultado obtenido el sistema mostrará los siguientes avisos:
 * a.	En el caso de que la palabra tenga una longitud inferior a 4 se mostrarla la palabra en mayúsculas
 * b.	En el caso de que la longitud sea diferente se mostrará la palabra en minúsculas
 */
package Uf1_Estructurada;

import java.util.Scanner;

public class CuartoEntrenamientoIntermedio {

    public static void main (String[] args){
        // Método de entrada
        Scanner Entrada = new Scanner(System.in);  // Se crea un objeto Scanner para leer la entrada del usuario

        // Variables
        String palabra;  // Variable para almacenar la palabra ingresada por el usuario
        int longitud = 0;  // Variable para almacenar la longitud de la palabra

        // Entrada del usuario
        System.out.println("ingrese una palabra para calcular su longitud ");  // Se pide al usuario que ingrese una palabra
        palabra = Entrada.next();  // Se lee la palabra desde la consola

        // Método length
        longitud = palabra.length();  // Se usa el método .length() para obtener la longitud de la palabra

        // Testeo
        System.out.println("La longitud de la palabra es de: " + longitud + " caracteres");  // Se imprime la longitud de la palabra

        // Condicionales
        if (longitud <= 4){  // Si la longitud de la palabra es menor o igual a 4
            String mayuscula = palabra.toUpperCase();  // Se convierte la palabra a mayúsculas usando el método .toUpperCase()
            System.out.println("En mayúsculas se imprime así: " + mayuscula);  // Se imprime la palabra en mayúsculas
        } else {  // Si la longitud es mayor a 4
            String minusculas = palabra.toLowerCase();  // Se convierte la palabra a minúsculas usando el método .toLowerCase()
            System.out.println("En minúsculas se imprime así: " + minusculas);  // Se imprime la palabra en minúsculas
        }
    }
}

