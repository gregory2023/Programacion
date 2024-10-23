package Uf1_Estructurada.ciclos;

import java.util.Scanner;

public class forEjercicioClase02 {

    public static void main (String[] args){

        ejercicioUno();

    }

    private static void ejercicioUno(){

        Scanner Entrada = new Scanner(System.in);

        int suma=0 ;
        int cantidadNumeros;
        int numero;

        do {

            System.out.println("Cuantos numeros quieres ingresar ");
            cantidadNumeros=Entrada.nextInt();

        }while(cantidadNumeros<=0);



        //pedir numero manual mente
        /*System.out.println("ingresa el numero1 ");
        suma +=Entrada.nextInt();
        System.out.println("ingresa el numero1 ");
        suma +=Entrada.nextInt();
        System.out.println("ingresa el numero1 ");
        suma +=Entrada.nextInt();
        System.out.println("ingresa el numero1 ");
        suma +=Entrada.nextInt();

        System.out.println("suma " + suma);


         */

        for (int i = 1; i <= cantidadNumeros; i++) {

            do {

                System.out.println("ingresa el numero : " +i);
                numero=Entrada.nextInt();
                suma +=numero;

            }while(numero<=0);

        }

        System.out.println("la suma es " + suma);
    }
}
