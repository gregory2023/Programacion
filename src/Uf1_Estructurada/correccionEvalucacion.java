package Uf1_Estructurada;

import java.util.Scanner;

public class correccionEvalucacion {

    public static void main(String[] args) {

        ejercicio1();

    }

    private static void ejercicio1() {
        Scanner Entrada = new Scanner(System.in);

        int opc1;
        int opc2;
        int opc3;
        double ivaproducto = 0;


        System.out.println("1.socio \n2.No socio");
        opc1 = Entrada.nextInt();

        switch (opc1) {
            case 1: {
                System.out.println("1.tomate \n2.lechuga \n3.pan ");
                opc2 = Entrada.nextInt();

                switch (opc2) {
                    case 1: {
                        ivaproducto = 10 + (10 * 0.1);
                        System.out.println("tomate vale " + ivaproducto);
                        break;
                    }
                    case 2: {
                        ivaproducto = 8 + (8 * 01);
                        System.out.println("lechuga vale " + ivaproducto);
                        break;
                    }
                    case 3: {
                        ivaproducto = 1 + (1 * 01);
                        System.out.println("el pan vale " + ivaproducto);
                        break;
                    }
                    default: {

                        System.out.println(" producto = 0");

                    }

                }
                break;
            }
            case 2: {
                System.out.println("1.tomate \b 2.lechuga \b 3.pan ");
                opc3 = Entrada.nextInt();
            }
            switch (opc3) {
                case 1: {
                    ivaproducto = 12 + (12 * 01);
                    System.out.println("tomate vale " + ivaproducto);
                    break;
                }
                case 2: {
                    ivaproducto = 10 + ((10 * 01)/100);
                    System.out.println("lechuga vale " + ivaproducto);
                    break;
                }
                case 3: {
                    ivaproducto = 3 + (3 * 01);
                    System.out.println("el pan vale " + ivaproducto);
                    break;
                }

                default: {
                    System.out.println(" producto = 0");
                }
                break;
            }
        }
    }
}