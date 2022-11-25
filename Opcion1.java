package Principal;

import java.io.FileOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opcion1 extends Persona {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Persona p = new Persona();
        int cantidadesP[] = new int[10];
        String nombresP[] = new String[10];
        double valoresP[] = new double[10];
        String nombreP;
        double valorP;
        int cantidadP = 0;
        int acumulador = 0;
        boolean rep = true;
        while (rep == true) {
            try {
                for (int i = 0; i < 10; i++) {
                    int op = 0;
                    System.out.println(" ___________________________________________________ ");
                    System.out.println("|                                                   |");
                    System.out.println("|      ++++++++++++++++MENU+++++++++++++            |");
                    System.out.println("|___________________________________________________|");
                    System.out.println("|1) Rollo de canela.........................C$ 15.00|");
                    System.out.println("|2) Baguette................................C$ 20.00|");
                    System.out.println("|3) Pan frances.............................C$ 25.50|");
                    System.out.println("|4) Rollo de pan............................C$ 20.00|");
                    System.out.println("|5) Pan de sal..............................C$ 25.00|");
                    System.out.println("|6) Pan blanco..............................C$ 20.50|");
                    System.out.println("|7) Empanadas...............................C$ 30.50|");
                    System.out.println("|8) CheeseCake..............................C$ 45.00|");
                    System.out.println("|___________________________________________________|");
                    System.out.println("|22) Cancelar compra                                |");
                    System.out.println("|11) Compra Lista                                   |");
                    System.out.println("|___________________________________________________|");
                    System.out.println("Seleccione una opcion:                               ");
                    System.out.println("_____________________________________________________");

                    op = n.nextInt();

                    switch (op) {
                        case 1:
                            nombreP = "Rollo de canela";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 15.00;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 2:
                            nombreP = "Baguete        ";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 20.00;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 3:
                            nombreP = "Pan frances    ";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 25.50;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 4:
                            nombreP = "Rollo de pan   ";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 20.00;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 5:
                            nombreP = "Pan de sal     ";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 25.00;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 6:
                            nombreP = "Pan blanco     ";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 20.50;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 7:
                            nombreP = "empanada       ";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 30.50;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 8:
                            nombreP = "CheeseCake     ";
                            System.out.println("Producto: " + nombreP);
                            System.out.println("____________________________________________");
                            System.out.print("Cuantas quieres comprar? : ");
                            cantidadP = n.nextInt();
                            cantidadesP[i] = cantidadP;
                            nombresP[i] = nombreP;
                            valoresP[i] = cantidadP * 45.00;
                            rep = true;
                            System.out.println("Agregado");
                            break;
                        case 22:
                            System.out.println("Compra cancelada");
                            rep = false;
                            i = 11;
                            break;
                        case 11: {
                            if (cantidadP <= 0) {
                                System.out.println("No se ha comprado nada!!");
                                rep = false;
                                i = 11;
                            } else {
                                String nombreCompleto;
                                System.out.println("____________________________________________");
                                System.out.println("Ingrese su nombre: ");
                                p.setNombre(n.next());
                                System.out.println("____________________________________________");
                                System.out.println("Ingrese su apellido: ");
                                p.setApellido(n.next());
                                System.out.println("____________________________________________");
                                nombreCompleto = p.getNombre() + " " + p.getApellido();
                                System.out.println("____________________________________________");
                                System.out.println("Guardando...");
                                double subtotal = 0;
                                double total = 0;
                                double iva = 0;
                                for (int j = 0; j < acumulador; j++) {
                                    subtotal += valoresP[j];

                                }
                                iva = subtotal * 0.15;
                                total = iva + subtotal;
                                //mostrar factura al usuario
                                System.out.println("********************Factura*********************");
                                System.out.println("Nombre: " + nombreCompleto);
                                System.out.println("************************************************");
                                System.out.println("Producto             Cantidad          Valor");
                                for (int j = 0; j < acumulador; j++) {
                                    System.out.println(nombresP[j] + "        " + cantidadesP[j] + "               " + valoresP[j]);
                                }
                                System.out.println("Sub total = " + subtotal);
                                System.out.println("Iva       = " + iva);
                                System.out.println("Total     = " + total);
                                //guarar fichero Historial - Resumen
                                String factura = " Nombre cliente: " + nombreCompleto + " Subtotal: " + String.valueOf(subtotal) + " Iva: " + String.valueOf(iva) + " Total: " + String.valueOf(total) + "\n";
                                try {
                                    FileOutputStream info = new FileOutputStream("informacion.txt", true);
                                    String cadena = factura;
                                    byte b[] = cadena.getBytes();
                                    info.write(b);
                                    info.close();
                                    System.out.println("Guardada");
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                i = 11;
                                rep = false;
                                Opcion3.CrearFichero("********************Factura*********************\n"
                                        + "Nombre: " + nombreCompleto+ "\n"
                                        + "************************************************\n"
                                        + "Producto             Cantidad          Valor    \n");
                                for (int j = 0; j < acumulador; j++) {
                                    Opcion3.CrearFichero(nombresP[j] + "        " + String.valueOf(cantidadesP[j]) + "               " + String.valueOf(valoresP[j]));
                                }
                                Opcion3.CrearFichero("Sub total = " + subtotal + "\n"
                                        + "Iva       = " + iva + "\n"
                                        + "Total     = " + total + "\n"
                                        + "************************************************");

                            }

                        }

                        break;
                        default:
                            System.out.println("Valor no disponible");
                    }
                    acumulador++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite un numero no caracteres");
                n.nextLine();
                rep = true;
            }
        }

    }
}