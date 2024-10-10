/**
 * El ejercicio consistirá en utilizar lo explicado en la Unidad Formativa para realizar una aplicación que realice la siguiente secuencia de acciones:
 * 1.	La aplicación pedirá al usuario introducir por consola un valor numérico (representará una cantidad de euros).
 * 2.	Una vez introducida se mostrará mediante un menú con tres opciones: si se quiere convertir a dólares, libras o yenes.
 * 3.	Se pedirá al usuario que introduzca una opción (a que moneda quiere convertir). En caso de seleccionar una invalida apareceré el mensaje “Opción incorrecta” y el programa terminará
 * 4.	Cuando el usuario indique la opción correcta, se mostrará un mensaje indicando el valor convertido con el siguiente formato “XX euros corresponden a XX dolares”
 */
package Uf1_Estructurada;

import java.util.Scanner;

public class TercerEntrenamientoIntermedio {

    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);  // Se crea un objeto Scanner para leer la entrada del usuario.

        double euros;  // Variable para almacenar la cantidad de euros que se ingresará.
        int opc;  // Variable para almacenar la opción seleccionada por el usuario en el menú.

        // Bucle do-while para pedir una cantidad de euros válida (mayor que 0)
        do {
            System.out.println("ingrese el numero de euros que quiere convertir");
            euros = Entrada.nextDouble();  // El usuario ingresa la cantidad de euros.
        } while (euros <= 0);  // El bucle continúa hasta que el usuario ingrese un valor mayor a 0.

        // Se imprime el menú de opciones de conversión
        System.out.println("Bienvenidos al conversor de divisas  \n1.  LIBRAS \n2.  YENES \n3.  DOLARES \n4. SALIR");
        System.out.println("Seleccione por favor la divisa a la que desea convertir su dinero");
        opc = Entrada.nextInt();  // El usuario selecciona la divisa.

        // Switch-case para manejar la opción seleccionada
        switch (opc) {
            // Caso 1: Convertir a libras esterlinas
            case 1: {
                double conversionlibras = euros * 0.85;  // La tasa de conversión de euros a libras es 0.85.
                System.out.println("Sus euros : " + euros + " en libras esterlinas equivalen a  " + conversionlibras);
                break;
            }
            // Caso 2: Convertir a yenes japoneses
            case 2: {
                double conversionYenes = euros * 155.0;  // La tasa de conversión de euros a yenes es 155.0.
                System.out.println("Sus euros : " + euros + " en yenes equivalen a  " + conversionYenes);
                break;
            }
            // Caso 3: Convertir a dólares estadounidenses
            case 3: {
                double conversionDolares = euros * 1.10;  // La tasa de conversión de euros a dólares es 1.10.
                System.out.println("Sus euros : " + euros + " en dolares equivalen a  " + conversionDolares);
                break;
            }
            // Caso 4: Opción de salida
            case 4: {
                System.out.println("Hasta pronto, Gracias");  // Mensaje de despedida si el usuario elige salir.
                break;
            }
            // Caso por defecto: Si el usuario ingresa una opción inválida.
            default: {
                System.out.println("valor no valido");  // Se indica que el valor ingresado no es válido.
                break;
            }
        }
    }
}

