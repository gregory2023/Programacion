package Uf1_Estructurada.arreglos;

import java.util.Scanner;

public class ejercicioDos {

    public static void main (String[] args){
        Scanner Entrada= new Scanner(System.in);
        int cantidadArreglo=0;

        System.out.println("cantidad de campos que va a tener el arreglo ");
        cantidadArreglo= Entrada.nextInt();

        char [] letras = new char[cantidadArreglo];

        for (int i = 0; i <cantidadArreglo ; i++) {

            System.out.println("ingrese el caracter");
            letras[i]=Entrada.next().charAt(0);

            
        }

        for (int i = 0; i <cantidadArreglo ; i++) {

            System.out.println(letras[i]);
            
        }
    }
}
