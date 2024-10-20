package Uf1_Estructurada.ciclos;

public class ejercicioSuma50PrimerosNumeros {

    public static void main(String[] args ){

        iteradoresFor();

    }

       /** int suma=0 ;
        for (int i = 1; i <=50 ; i*=5) {

            suma = suma + i;

            System.out.println(suma);
            System.out.println("este es " + i);

        }
    }*/

    public static void iteradoresFor (){

        System.out.println("iterador hasta 4 ");
        for (int i = 1; i <=4; i++) {

            System.out.println(i);
        }

        System.out.println("iterador hasta 6 de 2 en 2 ");
        for (int i = 0; i <= 6; i=i+2) {
            System.out.println(i);
        }

        System.out.println("iterados hasta 15 de 5 en 5 ");
        for (int i = 0; i <=15 ; i=i+5) {
            System.out.println(i);
        }

        System.out.println("multiplicacion ");
        for (int i = 1; i <=64 ; i=i*2) {
            System.out.println(i);
        }

        System.out.println("fibonachi ");

        int n3 = 1 ;
        int n1 = 0;
        int n2= 1;

        System.out.print(" 1 ");
        for (int i = 1; i <=15 ; i++) {

            n3 = n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;

        }
    }
}
