package Uf1_Estructurada.ciclos;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class forEjerciciosClase {

    public static void main (String [] args ){

        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        //ejerciciocuatro();
        //ejercicioCinco();
        //ejercicioSeis();
        //ejercicioSiete();
        //ejercicioOcho();
        //ejercicioNueve();
        //ejercicioDiez();
        //ejercicioOnce();
        //ejercicioDoce();
        //ejercicioTrece();
        //ejercicioCatorce();
        //ejercicioQuince();
        //ejercicioDieciseis();
        //ejercicioDieciseis();
        //ejercicioDiecisiete();
        //ejercicioDieciocho();
        //ejercicioDiecinueve();
        //ejercicioVeinte();
    }

    private static void ejercicioUno () {

        System.out.println(" 1 al 10, cada uno en una nueva línea.");
        for (int i = 1; i <= 10; i++) {

            System.out.println("Posicion : " + i);
        }
    }
    private static void ejercicioDos () {
        System.out.println(" Imprime los números pares entre 1 y 20");
        for (int i = 2; i <= 20; i += 2) {


            System.out.println("Posicion : " + i);
        }
    }

    private static void ejercicioTres (){
                System.out.println("Imprime la suma de los números del 1 al 100.");
                int suma=0;
                for (int i = 1; i <=100 ; i++) {

                    suma = suma + i;
        }

            System.out.println("la suma de todos los numero del 1 al 100 es " +  suma);

    }

    private static void ejerciciocuatro () {
        Scanner Entrada = new Scanner(System.in);
        //Dado un número entero positivo, imprime todos los divisores de ese número.
        int numero=0 ;

        do {
            System.out.println(" ingrese el numero para calcular sus divisores");
            numero = Entrada.nextInt();
        }while(numero<=0);


        for (int i = 1; i <= numero; i++) {

                if (numero % i == 0){

                    System.out.println(i);
            }
        }
    }

    private static void ejercicioCinco (){
        int numero=5;
        System.out.println("Imprime la tabla de multiplicar del 5.");

        for (int i = 1; i <=10 ; i++) {

            System.out.println( numero +  " x" + i + " = " + ( i*numero));

        }
    }

    private static void ejercicioSeis (){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Imprime las tablas de multiplicar entre 2 números.");

        int numeroUno=0;
        int numeroDos=0;

        System.out.println("ingrese el numero de punto de partida ");
        numeroUno = Entrada.nextInt();
        System.out.println("ingrese el numero hasta donde quiere que se multiplique ");
        numeroDos= Entrada.nextInt();
        for (int i = numeroUno; i <=numeroDos ; i++) {

            System.out.println("tabla del " + i);

            for (int j = 1; j <=10 ; j++) {

                System.out.println(i + " x " + j + " = " + (i*j) );

            }

        }
    }


    private static void ejercicioSiete(){
        Scanner Entrada = new Scanner(System.in);

        int numero;
        int factorial=1;


        do {
            System.out.println("ingrese el numero para calcular su factorial ");
            numero= Entrada.nextInt();

            if (numero<=0){
                System.out.println("numero incorrecto, ingreselo de nuevo");
            }
        }while (numero <= 0);

        for (int i = 1; i <=numero ; i++) {

          factorial = factorial*i;


        }
        System.out.println(factorial);


    }

    private static void ejercicioOcho(){
       int filas = 5;
        for (int i = 1; i <=filas ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void ejercicioNueve(){

        System.out.println(" Imprime los números impares entre 1 y 20");
        for (int i = 1; i <= 50; i += 2) {


            System.out.println ( i);
        }
    }


    private static void ejercicioDiez(){

        System.out.println("Pide al usuario 3 números y determina el mayor de ellos. ");
        Scanner Entrada = new Scanner(System.in);

        int n1 ;
        int n2;
        int n3;
        int mayor=0;

        for (int i = 1; i <= 3; i ++) {

            System.out.println("ingrese el numero uno por favor ");
            n1=Entrada.nextInt();
            System.out.println("ingrese el numero dos por favor ");
            n2=Entrada.nextInt();
            System.out.println("ingrese el numero tres por favor ");
            n3=Entrada.nextInt();

            if (n1 > n2 && n1 > n3){
                mayor = n1;
            }else if (n2 > n1 && n2 >n3){
                mayor = n2;
            }else {
                mayor = n3;
            }

            System.out.println("numero mayor " + mayor);
        }
    }

    private static void ejercicioOnce(){

        int producto=1;
        System.out.println("Calcula el producto de los números del 1 al 10.");

        for (int i = 1; i <=10 ; i++) {

            producto = producto *i;
            System.out.println("PRODUCTO " + producto);
        }

    }

    private static void ejercicioDoce(){
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Pide al usuario 6 notas y calcula la media.");

        double nota ;
        double mediaNota;
        double sumaNota=0;

        for (int i = 1; i <=6; i++) {

            System.out.println("ingrese su nota numero " + (i));
            nota = Entrada.nextDouble();

            sumaNota += nota;


        }

        mediaNota=sumaNota/6;

        System.out.println("Su nota final es " + mediaNota);
    }

    private static void ejercicioTrece(){


        System.out.println("Imprime los números del 1 al 100, pero no imprimas los números divisibles entre 7.");

        for (int i = 1; i <=100 ; i++) {

            if (i%7==0){
                System.out.println("--");
            }else{
                System.out.println(i);
            }
        }

    }

    private static void ejercicioCatorce(){

        System.out.println("Muestra 10 números al azar. Al finalizar muestra el mayor de ellos");

        int numero ;
        int mayor=0;

        for (int i = 1; i <=10 ; i++) {
            numero = (int)(Math.random()*99);
            System.out.println(numero);

            if(numero>mayor){
                mayor=numero;
            }
        }

        System.out.println("numero mayor es  " + mayor);
    }


    private static void ejercicioQuince(){

        System.out.println("Imprime un cuadrado de 5x5 asteriscos.");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void ejercicioDieciseis(){

        int suma=0;

        System.out.println("Calcula la suma de los números pares entre 1 y 100.");

        for (int i = 1; i <=100 ; i++) {

            if(i%2==0){
                suma += i;
                System.out.println("suma " + i);
            }
        }
        System.out.println("la suma de los numeros pares del 1 al 100 ---> " + suma);
    }

    public static void ejercicioDiecisiete(){

        System.out.println("Imprime los números del 1 al 10 en orden inverso.");

        for (int i = 100 ; i >=0 ; i--) {
            System.out.println(i);
        }
    }

    private static void ejercicioDieciocho(){

        System.out.println("Imprime todos los números del 1 al 50 que sean múltiplos de 3 o 5");

        for (int i = 1; i <=50 ; i++) {

            if(i%3==0){
                System.out.println("multiplo de 3 : " + i);
            }

            if (i%5==0) {
                System.out.println("multiplo de 5 : "+ i);
            }
        }
    }

    private static void ejercicioDiecinueve(){

        System.out.println("Imprime las potencias de 2 desde 2^1 hasta 2^10.");

        int potencia;
        int numero=2;
        for (int i = 1; i <=10 ; i++) {

            potencia = (int)(Math.pow(numero,i));

            System.out.println("  Potencia  de 2^ " + i + " = " + potencia);
        }
    }

    public static void ejercicioVeinte(){

        System.out.println("imprime un patrón de números en forma piramidal, donde la primera fila tiene el número 1, " +
                "la segunda fila tiene el número 2 dos veces, y así sucesivamente hasta el número 5.");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
