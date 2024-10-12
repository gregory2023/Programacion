package Uf1_Estructurada.ciclos;

import java.util.Scanner;

public class WhileEjercicioUno {

    public static void main (String[] args){

        Scanner Entrada = new Scanner(System.in);

        int i = 1;
        int contador = 0;

        //este do while se repite solo si el contador es igual o menor a 0
        do {

            System.out.println("ingrese el numero de veces que quiere que se repita el iterador ");
            contador = Entrada.nextInt();

            if(contador<=0){
                System.out.println("numero envalido");
            }

        }while(contador <= 0);

        //este while se repite el numero de veces que el user le asigno al contador
        while(i <=contador){

            System.out.println("Numero : " + i );
            i++;
        }
    }
}
