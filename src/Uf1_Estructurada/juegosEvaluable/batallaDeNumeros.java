package Uf1_Estructurada.juegosEvaluable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class batallaDeNumeros {

    public static Scanner Entrada = new Scanner(System.in);
    public static int numeroJugador;
    public static int numereroMaquina;
    public static String nombre ;
    public static int puntos = 400 ;
    public static int partida=200 ;
    public static int partidasGanadas=0;

    public static int recompensa;
    public static void main (String[]  args){

        System.out.println("HOLA COMO TE LLAMAS ? ");
        nombre=Entrada.nextLine();
        System.out.println( " CADA INTENTO TIENE TRES RONDAS Y CADA INTENTO GANADO TIENE UN RECOMPENSA DE 400 PUNTOS ");


        inicioJuego();



    }
    private static void inicioJuego(){

        if (puntos >= 200){
            puntos -= partida;
            jugador();
        }
        else {
            System.out.println("LO SIENTO YA NO TIENES MAS PUNTOS SUFICIENTES\n QUIERES RECARGAR (SI/NO)");
            finJuego();
        }

    }


    private static void jugador (){


        boolean poderUtilizado ;
        String desicionPoder ;
        int desicionPoderDividir;
        int opc;


        for (int i = 1; i <=3; i++) {

            numeroJugador=(int)(Math.random()*12)+1;
            numereroMaquina=(int)(Math.random()*12)+1;

            System.out.println(nombre + " TU NUMERO ASIGNADO ES  " + numeroJugador);
            System.out.println(" maquina TU NUMERO ASIGNADO ES  " +  numereroMaquina);

            poderUtilizado=false;


            do {

                System.out.println(" QUIERES UTILIZAR UN PODER  (SI/NO) ? \nRECUERDA SOLO TIENES UN PODER POR RONDA ");
                desicionPoder = Entrada.nextLine();

                if (desicionPoder.equals("si") || desicionPoder.equals("SI")){

                    System.out.println("GENIAL AQUI TIENES TUS PODERES \n1.DIVIDIR VALOR CONTRINCANTE \n2.DOBLAR NUMERO \n3.ROBAR NUMERO CONTRINCANTE");
                    opc= Entrada.nextInt();
                    Entrada.nextLine();
                    switch (opc){
                        case 1:
                            System.out.println("IMPORTANTE !! SI EL NUMERO CONTRINCANTE ES MENOR O IGUAL A 5 PIERDES YA QUE NO SE PUEDE DIVIDIR ESTA CANTIDAD \nCONTINUAS- DIGITE UN NUMERO (1.SI/2.NO) ");
                            desicionPoderDividir = Entrada.nextInt();
                            Entrada.nextLine(); //LIMPIO EL BUFFER

                            if (desicionPoderDividir ==1){
                                numereroMaquina/=2;
                                System.out.println("PODER APLICADO");
                                poderUtilizado=true;

                            }
                            else {
                                System.out.println("VALE, VUELVES AL MENU INICIAL :) ");
                            }

                            break;


                        case 2:
                            numeroJugador*=2;
                            System.out.println(" PODER APLICADO , NUMERO POTENCIADO ES IGUAL A :  " + numeroJugador);
                            poderUtilizado=true;
                            break;


                        case 3:
                            numeroJugador=numereroMaquina;
                            System.out.println("PODER APLICADO, AHORA TU NUMERO ROBADO ES :" +numereroMaquina );
                            poderUtilizado=true;
                            break;

                        default: {
                            System.out.println("VALOR INCORRECTO");
                            break;
                        }
                    }
                }else if (desicionPoder.equals("no") || desicionPoder.equals("NO")){
                    System.out.println("VALE , JUEGAS SIN PODER");
                }

            }while(!poderUtilizado);

            maquina();
            operacion();
        }

        sumaPuntos();

    }

    public static void maquina (){

        int decision ;

        System.out.println("----------------------------------------------------------------------\nturno de maquina");

        decision=(int)(Math.random()*3)+1;


        switch (decision){
            case 1:

                System.out.println("MAQUINA A ELEGIDO EL PODER DE DIVIDIR TU NUMERO " );
                numeroJugador/=2;
                break;

            case 2:

                if (numereroMaquina<=10){
                    System.out.println("MAQUINA A ELEGIDO  DOBLAR SU NUMERO  " );
                    numereroMaquina*=2;
                    break;
                }

            case 3:
                System.out.println("MAQUINA A ELEGIDO ROBAR TU NUMERO " );
                numereroMaquina=numeroJugador;
                break;


            default:

                System.out.println("ERROR CAPA 8");
        }


    }

    public static void operacion (){

        if (numeroJugador > numereroMaquina){
            partida++;
            System.out.println(nombre + "tu numero es " + numeroJugador);
            System.out.println( "maquina tu numeroe es " + numereroMaquina);
            System.out.println("GANA " + nombre);
        } else if (numeroJugador==numereroMaquina) {
            System.out.println(nombre + "tu numero es " + numeroJugador);
            System.out.println( "maquina tu numeroe es " + numereroMaquina);
            System.out.println("empate");
        }else {
            System.out.println(nombre + "tu numero es " + numeroJugador);
            System.out.println( "maquina tu numeroe es " + numereroMaquina);
            System.out.println("gana maquina ");
        }

    }


    public static void sumaPuntos(){

        String desicion;

        if(partidasGanadas>2){
            puntos+=400;
        }else {
            System.out.println("RONDA PERDIDA ");
            System.out.println("quieres volver a jugar (si/no");
            desicion=Entrada.nextLine();

            if (desicion.equals("si") || desicion.equals("SI")){
                inicioJuego();
            }else{
                finJuego();
            }
        }
    }

    public static void finJuego(){
        System.out.println("gracias ");
    }
    // PUNTOS INICIALES DEL JUGADOR


// El jugador comienza con 1000 puntos

// COSTO POR RONDA
// Cada ronda cuesta 200 puntos

// RECOMPENSA POR GANAR UNA RONDA

// Si el jugador gana la ronda, obtiene 400 puntos

// VARIABLE PARA CONTROLAR EL USO DEL PODER "DOBLAR MÁQUINA"

// El poder "Doblar Máquina" solo se puede usar una vez por partida

// PODER "DOBLAR" (Jugador)£

// Este poder duplica el número del jugador
// Si el número resultante supera 11, el jugador pierde automáticamente la ronda

// PODER "DIVIDIR" (Jugador)

// Si el número del jugador es mayor que 5, se puede dividir entre 2 (redondeado hacia abajo)

// PODER "ROBO"

// Intercambia el número del jugador con el de la computadora

// PODER "DOBLAR MÁQUINA"

// Duplica el número de la computadora
// Si el número de la computadora supera 11 después de aplicar el poder, la computadora pierde automáticamente

// MECÁNICA DE LA RONDA

// 1. Se restan 200 puntos del total del jugador al iniciar la ronda
// 2. Se generan números aleatorios para el jugador y la computadora (entre 1 y 10)
// 3. El jugador puede elegir si usar uno de los poderes especiales
// 4. Se comparan los números (aplicando poderes si se usaron)
// 5. Si el número del jugador es mayor, gana la ronda y obtiene 400 puntos
// 6. Si el número de la computadora es mayor, el jugador no gana puntos en esa ronda
// 7. Si los puntos del jugador llegan a 0, el juego termina
// 8. El jugador puede optar por retirarse del juego en cualquier momento

}
