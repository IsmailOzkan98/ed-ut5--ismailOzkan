package Ej4;

import java.util.Scanner;

public class Ej4RA6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //introduccion de correo
        System.out.print("Introduce tu correo electronico: ");
        String correo = scanner.next();


        //validacion
        if (correo.matches("\\w+@[\\w.]+\\.(net|edu|gov)")) {//en caso que correo esta introducido correctamente dara true
            System.out.println("Correo Valido!");
        } else {
            System.out.println("Formato de correo introducido no valido!");
        }
    }
}
