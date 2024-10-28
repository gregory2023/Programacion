package Uf1_Estructurada.juegosEvaluable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class juegoDel21 {

    public static Scanner Entrada = new Scanner(System.in);

    //variables locales
    private static int numeroMaquina= 0 ;
    private static int numeroJugador=0;
    private static int sumaMaquina=0;
    private static int sumaJugador=0;
    private static boolean juegoActivo = true;
    private static  int contador =1;
    private static  String decision  ;
    private static String nombre;
    private static boolean plantaJugador = false;

    public static void main (String [] args){

        while (juegoActivo == true){
            inicioJuego();
        }
    }

    //funcion principal
    private static void inicioJuego(){

        System.out.println("Como te llamas ");
        nombre= Entrada.nextLine();

        numeroJugador= (int)(Math.random()*11)+1;
        System.out.println(" Hola " + nombre + " tu  carta inicial  " + numeroJugador);
        sumaJugador+= numeroJugador;

        numeroMaquina = (int) (Math.random() * 11) + 1;
        System.out.println(" Hola amelIA tu carta inicia es " + numeroMaquina );
        sumaMaquina += numeroMaquina;

        turnoJugador();


    }

    private static int turnoMaquina() {

        boolean bandera = false;


        if (juegoActivo == true){

            do {

                System.out.println("quieres una carta nueva Amelie ");
                numeroMaquina = (int) (Math.random() * 11) + 1;
                System.out.println("Carta nueva " + numeroMaquina);
                sumaMaquina += numeroMaquina;
                System.out.println("llevas un acomualado " + sumaMaquina);

                if (sumaMaquina >=18 && sumaMaquina <= 20){
                    System.out.println(" Amelie se planta con un acumulado de " + sumaMaquina );
                    bandera=true;
                    juegoActivo=false;
                    if (plantaJugador == false){
                        turnoJugador();
                    }else {
                        System.out.println(" jugador se planto ");
                        sePlantan();
                    }

                }else if (sumaMaquina >=15 && sumaMaquina <=17) {
                    System.out.println("Amelie pasa el turno ");
                    if (plantaJugador==true){
                        System.out.println(" jugador ya se planto ");
                        turnoMaquina();
                    }else {
                        turnoJugador();
                    }

                }else if (sumaMaquina >21){

                    System.out.println("Pierdes amelIA con un acumulado de " + sumaMaquina);
                    bandera=true;
                    juegoActivo = false;
                    System.out.println("EL Ganador es " + nombre + " con " + sumaJugador);
                    juegoActivo=false;
                    nuevojuego();

                }else if (sumaMaquina == 21){
                    System.out.println(" Gana  amelIA con " + sumaMaquina);
                    bandera=true;
                    juegoActivo=false;
                    nuevojuego();
                }

            }while(bandera!=true);
        }


        return 0;
    }
    private static int turnoJugador(){
        //Se declara la variable
        boolean bandera = false;
        String turno ;


        if (juegoActivo == true ){

            do {
                System.out.println("quieres una carta nueva " + nombre + " si/no ");
                decision = Entrada.nextLine();
                contador ++;
                if(decision.equals("si")|| decision.equals("SI")){
                    numeroJugador = (int)(Math.random()*10)+1;
                    System.out.println("Carta nueva " + numeroJugador);
                    sumaJugador+= numeroJugador;
                    System.out.println("llevas un acomualado " + sumaJugador);

                    if (sumaJugador==21){
                        System.out.println(" HAS GANADO  " +  nombre + " con el acumulado de " + sumaJugador);
                        bandera=true;
                        juegoActivo=false;
                    } else if (sumaJugador > 21) {

                        System.out.println("HAS PERDIDO "  + nombre);
                        System.out.println("numero de cartas solcitadas " + contador);
                        bandera=true;
                        juegoActivo=false;
                    }

                }else if(decision.equals("no") || decision.equals("NO")){

                    System.out.println("quieres pasar turno SI/NO ? -- Al elegir  NO te plantas   " );
                    turno=Entrada.nextLine();
                    if (turno.equals("SI") || turno.equals("si")){
                        System.out.println(plantaJugador);
                        turnoMaquina();

                    } else if(turno.equals("NO") || turno.equals("no")) {

                        System.out.println("te plantas con " + sumaJugador );
                        plantaJugador=true;
                        bandera=true;

                        if(sumaMaquina>17 ){
                            sePlantan();
                        }else if (juegoActivo == true) {
                            turnoMaquina();
                        }
                    }

                }else{
                    System.out.println("opcion invalida");
                }

            }while(bandera!=true);
        }


        return 0;
    }

    private static void sePlantan() {

        if (sumaJugador > sumaMaquina) {
            System.out.println("FELICIDADE JUGADOR " + nombre + " ganas con " + sumaJugador);
            juegoActivo=false;
            nuevojuego();
        } else if (sumaMaquina == sumaJugador) {
            System.out.println(" ES UN EMPATE  "  );
            juegoActivo=false;
            nuevojuego();
        } else {
            System.out.println("GANA amelIA con el acumulado de " + sumaMaquina);
            juegoActivo=false;
            nuevojuego();
        }
    }

    private static void nuevojuego(){

        System.out.println("quieres volver a jugar SI/NO");
        decision=Entrada.nextLine();

        if (decision.equals("si")|| decision.equals("SI")){
            numeroMaquina= 0 ;
             numeroJugador=0;
             sumaMaquina=0;
             sumaJugador=0;
             contador =1;
            juegoActivo=true;
            plantaJugador=false;

        }else {
            System.out.println("NOS VEMOS , GRACIAS ");
            juegoActivo=false;
        }
    }
}
