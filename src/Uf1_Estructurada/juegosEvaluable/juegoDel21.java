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
        int sumatotal = 21;
        int necesarioP;
        float probabilidad;
        int cartasJugadas = 10;  // Inicialmente, quedan 10 cartas posibles ya que cada jugador ya recibió una carta
        int cartasParaPerder;
        boolean bandera = false;

        if (juegoActivo && sumaMaquina < 21) { // Verifica si el juego está activo y si la suma es menor que 21.
            do {
                System.out.println("¿Quieres una carta nueva AmelIA?");
                int numeroMaquina = (int) (Math.random() * 11) + 1;
                System.out.println("Carta nueva " + numeroMaquina);
                sumaMaquina += numeroMaquina;

                if (sumaMaquina > 21) { // Verifica si se superó 21 inmediatamente después de sacar una nueva carta.
                    System.out.println("AmelIA pierde con un acumulado de " + sumaMaquina);
                    juegoActivo = false;
                    System.out.println("El ganador es " + nombre + " con " + sumaJugador);
                    nuevojuego();
                    return 0; // Termina el turno de la máquina inmediatamente si pierde.
                }

                // Calcular el valor de carta máximo para no perder
                necesarioP = sumatotal - sumaMaquina;

                // Contar cuántas cartas provocarían perder si se superan 21 puntos
                cartasParaPerder = 0;
                for (int i = 1; i <= 11; i++) {
                    if (i > necesarioP) {
                        cartasParaPerder++;
                    }
                }

                // Calcular probabilidad en base a las cartas restantes en el juego
                if (necesarioP < 1) {
                    probabilidad = 100;  // Probabilidad máxima si cualquier carta causaría pérdida
                } else {
                    probabilidad = ((float) cartasParaPerder / cartasJugadas) * 100;
                }

                // Validar que la probabilidad esté dentro del rango 0 - 100
                if (probabilidad < 0) {
                    probabilidad = 0;
                } else if (probabilidad > 100) {
                    probabilidad = 100;
                }

                cartasJugadas--;  // Reducir el número de cartas restantes en el mazo después de cada turno

                System.out.println("Acumulado actual " + sumaMaquina);
                System.out.println("Con una carta de valor " + necesarioP + " o más podrías perder.");
                System.out.println("Probabilidad de perder en este momento: " + probabilidad);

                // Condiciones para plantarse, pasar el turno o continuar
                if (probabilidad >= 81.73 && probabilidad <=98.0 ) {
                    System.out.println("AmelIA se planta con un acumulado de " + sumaMaquina);
                    bandera = true;
                    juegoActivo = false;
                    if (!plantaJugador) {
                        turnoJugador();
                    } else {
                        System.out.println("El jugador se plantó también.");
                        sePlantan();
                    }
                } else if (probabilidad >= 63.1 && probabilidad <=81.0) {
                    System.out.println("AmelIA pasa el turno.");
                    if (plantaJugador) {
                        System.out.println("El jugador ya se plantó.");
                        System.out.println("Probabilidad de perder en este momento: " + probabilidad);
                        System.out.println("AmelIA se planta");
                        sePlantan();
                    } else {
                        turnoJugador();
                    }
                } else if (sumaMaquina == 21) {
                    System.out.println("AmelIA gana con " + sumaMaquina);
                    bandera = true;
                    juegoActivo = false;
                    nuevojuego();
                }

            } while (!bandera);
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

        if(sumaJugador<=21 && sumaMaquina<=21)    {

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
        }else {
            System.out.println("alguno de los jugadores se planto con una suma mayor a 21 ");
            nuevojuego();
        }

    }

    private static void nuevojuego(){

        System.out.println("quieres volver a jugar SI/NO");
        decision=Entrada.nextLine();

        if (decision.equals("si")|| decision.equals("SI")){
            numeroMaquina= 0 ;
             numeroJugador=0;
             sumaMaquina= 0;
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
