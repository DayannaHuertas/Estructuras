package actividadrepasoparcial;

import java.util.Scanner;

public class ciclowhile {

    public static void main(String[] args) {

        Scanner uwu = new Scanner(System.in);

        int numeros=0 , suma = 0;
        String e = "r";

        while (!e.equals("s")) {
            System.out.print("Ingrese un numero:");
            numeros = uwu.nextInt();

            suma = suma + numeros;
            System.out.println("Desea seguir ingresando un numero");
            System.err.println("Para salir imprima la tecla s");
            e = uwu.next();


        }
        System.out.print("su sumas es: " + suma);
       

    }

}
