/**
 *
 */

package Uf1_Estructurada;

import java.util.Scanner;

public class RetoClaseCarlosBonoTransporte {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // Se crea un objeto Scanner para leer la entrada del usuario

        int edad;  // Variable para almacenar la edad del usuario
        int opc;   // Variable para almacenar la opción de zona elegida

        do {
            System.out.println("ingrese su edad por favor ");  // Se pide la edad del usuario
            edad = entrada.nextInt();  // Se lee la edad desde la consola

            if (edad < 5) {  // Si la edad es menor a 5, se considera inválida
                System.out.println("EDAD INVALIDA");  // Mensaje de error si la edad es inválida
            } else {  // Si la edad es válida (5 o más)

                // Se muestra el menú de opciones para elegir la zona
                System.out.println("ingrese el numero de la zona a la cual quiere abonarce");
                System.out.println("1.ZONA A ");
                System.out.println("2.ZONA B ");
                System.out.println("3.ZONA C ");
                opc = entrada.nextInt();  // Se lee la opción de zona seleccionada

                // Se utiliza una estructura switch para determinar el valor del bono según la zona elegida
                switch (opc) {

                    case 1: {  // Si elige la ZONA A

                        // Se evalúa el valor del bono según la edad
                        if (edad >= 5 && edad <= 18) {
                            System.out.println(" El valor del bono por esta zona es de 8 euros   ");  // Bono para menores de 18
                        } else if (edad > 18 && edad <= 65) {
                            System.out.println("El valor del bono por esta zona es de 50 euros ");  // Bono para adultos hasta 65 años
                        } else {
                            System.out.println("El valor del bono por esta zona es de 1 euros");  // Bono para mayores de 65
                        }

                        break;
                    }

                    case 2: {  // Si elige la ZONA B

                        if (edad >= 5 && edad <= 18) {
                            System.out.println(" El valor del bono por esta zona es de 8 euros   ");  // Bono para menores de 18
                        } else if (edad > 18 && edad <= 65) {
                            System.out.println("El valor del bono por esta zona es de 70 euros ");  // Bono para adultos hasta 65 años
                        } else {
                            System.out.println("El valor del bono por esta zona es de 1 euros");  // Bono para mayores de 65
                        }

                        break;

                    }

                    case 3: {  // Si elige la ZONA C

                        if (edad >= 5 && edad <= 18) {
                            System.out.println(" El valor del bono por esta zona es de 8 euros   ");  // Bono para menores de 18
                        } else if (edad > 18 && edad <= 65) {
                            System.out.println("El valor del bono por esta zona es de 85 euros ");  // Bono para adultos hasta 65 años
                        } else {
                            System.out.println("El valor del bono por esta zona es de 1 euros");  // Bono para mayores de 65
                        }
                        break;
                    }
                }
            }

        } while (edad < 5 );  // El bucle se repite si la edad ingresada es menor de 5 años, aunque el código nunca vuelve a pedir la edad
    }
}
