package Uf1_Estructurada;

import java.sql.SQLOutput;

public class EjercicioClaseFunciones {

    public static void main (String[] args){

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio10();
        ejercicio11();
    }


       // Dado el nombre de un alumno, verifica si su cumpleaños es en el mes de octubre

    private static void ejercicio1(){

        String nombre = "gregory";
        int mes = 10;

        if(mes == 10){
            System.out.println(nombre + " cumple en el mes de octubre ");
        }else{
            System.out.println(nombre + " no cumple en octubre ");
        }

    }

    //Dado el nombre de un alumno y su grupo, verifica si pertenece al grupo "A" y su cumpleaños es en enero.
        private static void ejercicio2(){

        String mes  = "enero";
        char grupo = 'A';
        String nombre = "gregory";

        if(mes.equals("enero") && grupo == 'A' ) {

            System.out.println(nombre + " pertenece al grupo A y cumple en enero");
        }
        else {
            System.out.println("no pertenece al grupo ni cumple en enero");
        }

    }

    //Dado el nombre de un alumno y su mes de nacimiento, muestra si su cumpleaños ha pasado este año.

    private static void ejercicio3(){

        String nombre  = "gregory";
        int mesActual = 10;
        int mescumpleanos = 8;
        int diaCumpleaños = 19;
        int diactual= 15;

        if (diaCumpleaños>=mesActual){
            System.out.println(nombre + " no ha cumplido años aun en el 2024");
        }else {
            if(diactual<diaCumpleaños){
                System.out.println(nombre + "");
            }
            System.out.println(nombre + " ya cumplio años en el 2024");
        }
    }

    //Dado el nombre de un alumno, su grupo y su mes de nacimiento, verifica si su cumpleaños es en diciembre o pertenece al grupo "B".

    private static void ejercicio4(){

        String nombre = "gregory";
        char grupos = 'B';
        int cumpleanosMes = 11;

        if(cumpleanosMes == 12 ){

            System.out.println(nombre + " cumple en diciembre  ");

        }else{
            System.out.println(nombre + " no cumple en diciembre ");
        }


        if (grupos == 'B'){

            System.out.println( nombre + " pertenece al grupo B ");

        }else {

            System.out.println(nombre + " No pertenece al grupo B  ");
        }
    }

    //Dado el nombre de un alumno, su día y mes de nacimiento, verifica si es su cumpleaños hoy.

    private static void ejercicio6(){

        String noombre ="gregory";
        int diaCumpleanos = 19;
        int mesCumpleanos = 1;
        int diaActual = 15;
        int mesActual = 10;


        if (diaCumpleanos == diaActual && mesCumpleanos == mesActual ){

            System.out.println(noombre + " cumple hoy 15 de octubre ");
        }else {
            System.out.println(noombre + " no cumple hoy  ");
        }
    }

    //Dado el nombre de un alumno, su año y mes de nacimiento, verifica si ha cumplido 18 años.

    private static void ejercicio7 (){

        String noombre ="gregory";
        int mayorMesEdad= 9;
        int mayorEdadAno= 2006;
        int mesCumpleanos=1;
        int añoNaciomiento=2006;

        if (añoNaciomiento >=mayorEdadAno && mesCumpleanos < mayorMesEdad){
            System.out.println(noombre +  " ya es meyor de edad");
        }else {
            System.out.println(noombre + " no es mayor de edad aun ");
        }
    }

    //Dado el nombre de un alumno, su grupo y su mes de nacimiento, verifica si está en el grupo "C" y cumple en los primeros tres meses del año.

    private static void ejercicio8 (){

        String noombre ="gregory";
        char grupo = 'C';
        int MesNacimiento = 1;

        if (MesNacimiento <= 3 && grupo == 'C'){

            System.out.println( noombre + " cumplio en los primeros 3 meses del año y pertenece al grupo C ");

        }else {
            System.out.println(noombre + " no esta en las condiciones porque o no cumple en los primeros tres meses o no esta en el grupp C  ");
        }
    }

    //Dado el nombre de un alumno, su grupo y aficiones, verifica si cumple años en diciembre o si le gusta el deporte.

    private static void ejercicio9(){

        String nombre = "gregory";
        String aficion = "deporte";
        char grupo = 'A';
        int cumpleanos = 12;

        if (cumpleanos ==  12 && aficion.equals("deporte")){
            System.out.println(nombre + " Cumple en diciembre y le gustan los deportes");
        }else{
            System.out.println(nombre + "  no le gustan los deportes o no cumple en diciembre ");
        }
    }

    //Dado el nombre de un alumno y su mes y día de nacimiento, verifica si su cumpleaños es en un fin de semana.

    private static void ejercicio10 (){

        String nombre = "gregory";
        int MesNacimiento = 4;
        int DiaCumpleaños = 6;

        if(DiaCumpleaños == 6 ||  DiaCumpleaños == 7){
            System.out.println( nombre + " cumple años el fin de semana ");
        }else {
            System.out.println( nombre + " No cumple el fin de semana ");
        }
    }

    //Dado el nombre y mes de nacimiento de un alumno, muestra si su cumpleaños es en los meses de verano.
    private static void ejercicio5(){

        String nombre = "gregory";
        int MesNacimiento = 4;

        if (MesNacimiento >=6 && MesNacimiento <=8){

            System.out.println(nombre +" cumple en los meses de verano");
        }else{
            System.out.println(nombre + " no cumple en los meses de verano :(");
        }



        //Dado el nombre de un alumno, su año y mes de nacimiento, verifica si no ha cumplido años este año y aún es menor de edad.
        }
    private static void ejercicio11(){

        String nombre = "gregory";
        int MesNacimiento = 4;
        int AñoNaciomiento = 1;

        if (MesNacimiento < 10 && AñoNaciomiento >= 2006){

            System.out.println(nombre + " es mayor de 18 años  ");
        }else {

        }
    }

    private static void ejercico12(){

    

    }
}



