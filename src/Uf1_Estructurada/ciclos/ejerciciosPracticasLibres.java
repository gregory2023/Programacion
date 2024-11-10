package Uf1_Estructurada.ciclos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejerciciosPracticasLibres {

    public static void main  (String [] args ){

        //decremento();
        //suma10nuemero();
        //productoNumeroPares();
        //Factorial();
        //Medias();
        //sueldos();
        //Estudiantes();
        //piramide();
        //ejercicio14();
        ejercicio15();

    }

    private static void decremento (){

        for (int i = 100 ; i >=0 ; i-=7){

            System.out.println(i);
        }
    }

    private static void suma10nuemero (){

        int suma=0 ;
        for (int i = 1 ; i<=100; i++){
            suma +=i;

            System.out.println(suma);
        }
    }

    private static void productoNumeroPares(){

        long producto=1;

        for(int i = 1 ; i <=20; i++){

            if(i%2==0){

            }else {
               producto*=i;
            }
        }

        System.out.println(producto);
    }

    private static void Factorial(){
        Scanner Entrada = new Scanner (System.in);

        int numero;
        int factorial=1;

        System.out.println("ingrese el numero para calcular su factorial");
        numero = Entrada.nextInt();

        for (int i = 1; i<=numero ;i++){

            factorial *= i;
            System.out.println(factorial);
        }


    }

    private static void Medias (){
    Scanner Entrada = new Scanner (System.in);
        double mediaP;
        int sumaP=0;
        int contadorP=0;
        double mediaN;
        int sumaN=0;
        int contadorN=0;
        int contadorC=0;
        int numero =0;
        for (int i = 0; i <=10 ; i++){

            System.out.println("digite el numero " + (i+1));
            numero=Entrada.nextInt();
            if(numero >0) {
                contadorP++;
                sumaP += numero;
            }else if (numero==0){
                contadorC++;
            }else{
                contadorN++;
                sumaN += numero;
            }
        }

        mediaP = (double) sumaP/contadorP;
        mediaN = (double)sumaN/contadorN;

        System.out.println("media de numeros positivos " + mediaP);
        System.out.println("media de numeros negativos " + mediaN);
        System.out.println("cantidad de numeros cero " + contadorC);


    }

    private static void sueldos (){
        Scanner Entrada = new Scanner (System.in);
        int sueldo;
        int sumaS=0;
        int mayorMil=0;

        for (int i =1 ; i <= 10 ; i++){

            System.out.println(" INGRESE SU SUELDO EMPLEADO N : " +i);
            sueldo=Entrada.nextInt();
            sumaS+=sueldo;

            if(sueldo>1000){
                mayorMil ++;
            }
        }

        System.out.println("la suma de todos los sueldos " + sumaS  );
        System.out.println("la cantidad de sueldos mayores a 1000 E es " + mayorMil);
    }

    private static void Estudiantes (){
        Scanner Entrada = new Scanner(System.in);
        int edad =0;
        int SumaE =0;
        double edadM;
        double estatura;
        double SumaEs =0;
        double estaturaM;
        int estudiantesMayEdad=0;
        int cantidadMay175cm=0;
        int opc;

        for(int i = 1 ; i<=5 ; i++){

            System.out.println("ingrese la edad del estudiante N :" +i);
            edad = (int)(Math.random()*20)+1;
            System.out.println(edad);
            System.out.println("ingrese la estatura del estudiante N :" +i);
            estatura =(Math.random()*200)+1;
            System.out.println(estatura);

            SumaE += edad;
            SumaEs += estatura;

            if (edad >17 ){
                estudiantesMayEdad++;
            }

            if(estatura>175){
                cantidadMay175cm++;
            }
        }


        do {


            System.out.println("ingrese la opcion que quiera consultar  \n 1. Media de edad alumnos \n 2.media de estura \n 3. alumnos mayores de 18 \n 4. alumnos que miden mas 1.75 cm \n 5. salir ");
            opc=Entrada.nextInt();

            switch(opc){

                case 1 : {

                    edadM = SumaE/5;
                    System.out.println("la edad media de los ALUMNOS ES DE : " +edadM);
                    System.out.println(" ");
                    break;
                }
                case 2 : {
                    estaturaM = SumaEs/5;
                    System.out.println("el estatura media de los ALUMNOS ES DE " + estaturaM);
                    System.out.println(" ");
                    break;
                }
                case 3 : {
                    System.out.println("la cantidad de alumnos mayores a 18 años es de  " + estudiantesMayEdad );
                    System.out.println(" ");
                    break;
                }
                case 4 : {

                    System.out.println("la cantidad de alumnos que miden mas de 1.75 cm son " + cantidadMay175cm);
                    System.out.println(" ");
                    break;
                }
                default:{
                    System.out.println(" Nos vemos ");
                    System.out.println(" ");
                }
            }

        }while(opc != 5);
    }

    private static void piramide(){

        int numero =5;

        for (int i =1 ; i <=numero; i++){
            System.out.println("");
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
        }
    }


    public static void ejercicio14 (){

        int numero;
        int mayor=0;

        for (int i = 1; i <=10; i++) {
            numero= (int) (Math.random()*10)+1;
            System.out.println(numero);
            if (numero > mayor){
                mayor= numero;
            }
        }

        System.out.println("numero " + mayor);
    }


    public static void ejercicio15 (){

        int numero=0 ;

        for (int i = 1; i <=6; i++) {

            if(i<=4){

                numero+=5;
                System.out.print("-" +numero);
            }else{
                numero-=5;
                System.out.print("-" +numero);
            }
        }
    }

}


