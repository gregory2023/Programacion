package Uf1_Estructurada.ciclos;

import java.util.Scanner;

public class forEjercicioUno {

    public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        //tabla de multiplicar

        int tabla=0;

        do {

            System.out.println("ingrese la tabla de multiplicar que quiere imprimir ");
            tabla = Entrada.nextInt();

            if (tabla<=0){
                System.out.println("Valor errado , intentelo de nuevo ");

            }
        }while (tabla<=0);


        for (int i = 1; i <=10 ; i++) {
            int total = i * tabla ;
            System.out.println("numero : " + (i) + " por el numero " + tabla + " es = " + total);

        }
    }
}
