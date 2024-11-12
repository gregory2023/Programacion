package Uf1_Estructurada.ciclos;

import java.util.Scanner;

public class numeroNegativ {

    public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        int numero ;
        int numeronNegativo=0;
        boolean numerosNegativos=false;

        for (int i = 1; i <=10 ; i++) {


                System.out.println("ingrese un numero ");
                numero=Entrada.nextInt();

                if (numero<0) {
                    numeronNegativo++;
                    numerosNegativos = true;
                }

        }

        System.out.println(" hay numeros negativos " + numerosNegativos);
        System.out.println("hay esta cantidad de numeros negativos " + numeronNegativo );
    }
}
