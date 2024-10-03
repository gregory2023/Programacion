/*+
El ejercicio consistirá en utilizar lo explicado en la Unidad Formativa para realizar una aplicación que realice la siguiente secuencia de acciones:

1.	La aplicación pedirá por consola dos números.
2.	El programa realizará las siguientes comprobaciones:
a.	Si ambos son pares
b.	Si el primer número es más grande que el doble del segundo y menos que 8
c.	Si el primer número es igual al segundo o la resta de ambos es menor que 0
3.	Una vez realizadas estas, se mostrará por consola el resultado de cada una de ellas, mostrando el resultado de cada una de ellas

p.e: los dos números son pares (si es verdadero) / los dos numéros no son pares (falso)

 */

//paquete principal
package Uf1_Estructurada;

import java.lang.invoke.SwitchPoint;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class segundo_entrenamineto {

    public  static void main (String[] args){

        Scanner Entrada = new Scanner(System.in);


        //variables
        int A = 0 ;
        int B = 0;
        int bandera = 0;
        int mayor = 0;
        int  menor = 0 ;
        boolean pares = true ;


        //control de excepciones para valores menores a o
        do {

            //creo esta bandera para practicar
            bandera=0;

            System.out.println("ingrese el valor del primer numero :  " );
            A=Entrada.nextInt();

            System.out.println("ingrese el valor del segundo numero :  " );
            B=Entrada.nextInt();


            //mensaje para el usuario y condicional de valores menorea a 0
            if(A<=0 || B <=0){
                System.out.println("numeros invalidos valide los valores ingresados");
                //cambio de valor a la bandera -- podriamos hacerlo tambine con boleean
                bandera = 1;
            }

        }while (bandera == 1);

        //System.out.println("test");

        if ((A%2==0) || ((B%2==0))){
            System.out.println("los numeros son pares N.1: " + A + " N.2: "  + B + " . ");

        }else{
            System.out.println("No son pares ");
            pares = false;
        }

        if ((B*2<=A)){
            System.out.println("El numero uno es mayor que el doble del segundo " );
            System.out.println("N.1: " +  A + " y el doble del N.2 es: " + B*2 + " .");
        } else if (A<8) {
            System.out.println("El N.1 : " + A + " es menor que 8 ");
            System.out.println("El N.1 no es mayor a al doble del N.2 " + B*2);
        }

        if((A==B) || (A-B==0)){
            System.out.println("El N.1 : " + A + " y el N.2 : " + B + " son iguales \n Y su resta " + A + " - " + B + " = 0");

        }else{
            System.out.println("Su resta no es igual a 0 por lo tanto no son iguales \n N.1 " + A + " N.2 : " + B );
        }

        System.out.println("LOS NUMEROS SON PARES ? : R/ " + pares);

    }
}
