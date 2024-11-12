package Uf1_Estructurada.ciclos;

import java.util.Scanner;

public class calificaciones {

    public static void main (String [] args ){
        Scanner Entrada = new Scanner(System.in);
        float calificacion ;
        int suspenso=0;
        boolean suspensos = false;

        for (int i = 1; i <=10 ; i++) {
            System.out.println("imgrese la calificacion numero ");
            calificacion = Entrada.nextInt();

            if (calificacion<5){
                suspenso++;
                System.out.println(" supenso numero " + suspenso);
                suspensos=true;

            }
        }
        System.out.println("Hay algun  suspenso " + suspensos);
        System.out.println("cantidad de suspensos " + suspenso);

    }
}
