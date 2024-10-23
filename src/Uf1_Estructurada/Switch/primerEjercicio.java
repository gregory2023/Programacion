package Uf1_Estructurada.Switch;

public class primerEjercicio {

    public static void main (String[] args){
        int diaSemana = 7;


        switch (diaSemana){
            case 1:{
                System.out.println("lunes laborable ");
                break;
            }
            case 2:{
                System.out.println("martes laborable");
                break;
            }
            case 3:{
                System.out.println("mierocles laborable ");
                break;
            }
            case 4:{
                System.out.println("jueves laborable");
                break;
            }
            case 5:{
                System.out.println("viernes laborable ");
                break;
            }
            case 6:{
                System.out.println("sabado NO laborable ");
                break;
            }
            case 7:{
                System.out.println("domingo No laborable ");
                break;
            }

            default:{
                System.out.println("no existe el dia");
            }
        }

    }
}
