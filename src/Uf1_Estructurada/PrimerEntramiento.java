/**
 * El ejercicio consistirá en utilizar lo explicado en la Unidad Formativa para realizar una aplicación que realice la siguiente secuencia de acciones:

 * 1.	Realiza una aplicación que permita pedir tres valores números por consola
 * 2.	Una vez introducidos los tres valores, comprobar si la suma de los dos primeros es igual que el tercero (a+b=c)
 * 3.	Una vez realizada la comprobación mostrará por consola lo siguiente:
 * a.	Los dos primeros son la suma del tercero (en caso de serlo)
 * b.	Los dos primeros no son la suma del tercero (en caso de no serlo)
 */
package Uf1_Estructurada;

import java.util.Scanner;  // Importación de la clase Scanner para leer la entrada del usuario.

public class PrimerEntramiento {

    public static void main (String[] args){
        Scanner Entrada = new Scanner(System.in);  // Se crea un objeto Scanner para capturar datos del usuario.

        // Declaración de tres variables enteras para almacenar los números ingresados por el usuario.
        int a = 0;
        int b = 0;
        int c = 0;

        // Bucle do-while para asegurarse de que los tres números sean mayores a 0
        do {
            System.out.printf("Ingrese el valor del primer número: ");
            a = Entrada.nextInt();  // Captura el valor del primer número ingresado por el usuario.

            System.out.printf("Ingrese el valor del segundo número: ");
            b = Entrada.nextInt();  // Captura el valor del segundo número ingresado por el usuario.

            System.out.printf("Ingrese el valor del tercer número: ");
            c = Entrada.nextInt();  // Captura el valor del tercer número ingresado por el usuario.

            // El bucle continúa si alguno de los valores ingresados (a, b o c) es menor o igual a 0.
        } while ((a <= 0) || (b <= 0) || (c <= 0));

        // Verifica si la suma de 'a' y 'b' es igual a 'c'.
        if ((a + b) == c) {
            // Si la condición se cumple, muestra un mensaje indicando que la suma de 'a' y 'b' es igual a 'c'.
            System.out.println("La suma del primer número: " + a + " y el segundo número: " + b + " es igual al tercer número: " + c);
        } else {
            // Si la condición no se cumple, muestra un mensaje indicando que la suma es diferente.
            System.out.println("La suma del primer número y el segundo es diferente al tercer número.");
        }
    }
}
