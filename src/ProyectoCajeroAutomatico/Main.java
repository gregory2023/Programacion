package ProyectoCajeroAutomatico;

import javax.swing.JOptionPane;

public class Main {
        public static void main(String[] args) {

            int saldo = 1000;
            int opc = 0;
            //Los inicializo tipo string porque vamos a utilizar las ventanas amergentes , ya sobre la marcha los cambiamos a tipo int
            String ingreso1;
            String retiro1;

            //aqui utilizamos una interfaz para poder guardar los datos del user JOptionPane.showInputDialog
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            ;
            String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");
            ;
            String contraseña_correcta = "1234";


            do {

                if (contraseña_correcta.equals(contraseña)) {


                    //mostramos mensajes informativos  con el  JOptionPane.showMessageDialog
                    JOptionPane.showMessageDialog(null, " hola !! " + nombre);

                    //aqui con la ventana emergente recibimos datos de tipo string pero debemos pasarlos a datos tipo int
                    String opc0 = JOptionPane.showInputDialog(null, " ingrese la opcion que desee \n 1. Ver saldo \n 2. Ingresar dinero \n 3. Retirar dinero  \n 4.salir ");
                    //aqui con el operador  cambiamos el tipo de dato ingresado por el user al que querramos, este caso int
                    opc = Integer.parseInt(opc0);

                    //opc = Entrada.nextInt(); ---> scanner desabilitada

                    switch (opc) {
                        case 1: {
                            JOptionPane.showMessageDialog(null, "El saldo actual es " + saldo + " euros ");
                            break;
                        }
                        case 2: {
                            ingreso1 = JOptionPane.showInputDialog("ingrese el dinero que desea guardar en su cuenta");
                            int ingreso = Integer.parseInt(ingreso1);
                            saldo = saldo + ingreso;
                            JOptionPane.showMessageDialog(null, "Su saldo actual es " + saldo + " euros ");
                            break;
                        }
                        case 3: {
                            retiro1 = JOptionPane.showInputDialog("Cuanto dinero quiere retirar ?");
                            int retiro = Integer.parseInt(retiro1);
                            if (retiro <= saldo) {
                                saldo = saldo - retiro;
                                JOptionPane.showMessageDialog(null, "Retiro exitoso , su saldo actual es de  " + saldo + " euros ");
                            } else {
                                JOptionPane.showMessageDialog(null, "saldo insuficiente para la transaccion ");
                                JOptionPane.showMessageDialog(null, "saldo actual " + saldo + " euros , ---  dinero que quiere retirar " + retiro + " euros ");
                            }
                            break;
                        }
                        case 4: {
                            JOptionPane.showMessageDialog(null, "hasta pronto ");
                            break;
                        }
                        default: {
                            JOptionPane.showMessageDialog(null, "opcion equivocada");
                        }
                    }


                } else {
                    //ingresa la contraseña hasta que sea la correcta
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta señor " + nombre);
                    contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");

                }
            } while (opc != 4);
        }
    }
