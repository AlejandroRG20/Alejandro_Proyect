package Principal;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    

    public static void main(String[] args) throws IOException {
       
        Scanner n = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println(" ____________________________________________");
        System.out.println("|>>> Bienvenidos a panaderia Delicias S.A <<<|");
        System.out.println("|____________________________________________|");
        System.out.println("|1.Comprar                                   |");
        System.out.println("|2.Ver compras                               |");
        System.out.println("|3.Eliminar compras                          |");
        System.out.println("|4.Cerrar                                    |");
        System.out.println("|____________________________________________|");
        System.out.println("opcion:                                     ");

        try {
            opcion = n.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("digite un numero no caracteres");
            n.next();
        }
        switch (opcion) {
            case 1:
                Opcion1 O1 = new Opcion1();
                O1.main(args);
                break;
            case 2:
                Opcion2 O2 = new Opcion2();
                O2.main(args);
                break;
            case 3:
                Opcion3 O3 = new Opcion3();
                O3.main(args);
                break;
            case 4:
                System.out.println("_______________________________");
                System.out.println("QUE TENGO BUEN DIA");
                System.out.println("_______________________________");
                System.out.println("FIN DEL PROGRAMA, te amo fer <3");
                System.out.println("_______________________________");
                System.exit(0);
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
}
