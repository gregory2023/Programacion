package Uf1_Estructurada.ciclos;

import java.util.Scanner;

public class EjercicioAdivinanzaWhile {

    public static void main (String[] args ){
        Scanner Entrada = new Scanner(System.in);

        int numero ;
        int user;

        //generar el numero ramdon

        numero = (int)(Math.random() * 10) + 1;;

        //System.out.println(numero);


        do  {

            System.out.println("digita el numero que crees que es  ");
            user = Entrada.nextInt();


        }while (numero != user);

        System.out.println("has adivinado el numero");
    }
}


