/**
 *
 */

package Uf1_Estructurada;

import java.util.Scanner;

public class Ejercicio_volumen_caja {

    public static void main (String[]args){

        Scanner Entrada = new Scanner(System.in);

        double  lado_a = 0;
        double  lado_b  = 0;
        double  lado_c = 0;
        int bandera = 1 ;


        //este do while funciona para iterar las veces que sea necesarias si alguno de los valores ingresados es menor o igual que 0

        do {


            bandera=1;

            System.out.println("ingrese el lado A ");
            lado_a = Entrada.nextDouble();

            if(lado_a <= 0){
                bandera = 0 ;
                System.out.println("corrija el valor en la siguiente iteracion");
               }

            System.out.println("ingrese el lado B");
            lado_b = Entrada.nextDouble();

            if(lado_b <= 0){
                bandera = 0 ;
                System.out.println("corrija el valor en la siguiente iteracion");

            }
            System.out.println("ingrese el lado C ");
            lado_c= Entrada.nextDouble();

            if(lado_c <= 0) {
                bandera = 0 ;
                System.out.println("corrija el valor en la siguiente iteracion");

            }


        }while (bandera==0);


        double  volumen = lado_a * lado_c * lado_b;

        System.out.println(" EL VALOR DEL VOLUMEN ES " + volumen);




    }
}
