package Ej5;

import java.util.Random;
import java.util.Scanner;

public class puntoAppEj5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        System.out.print("Introduce cantidad de puntos deseados: ");
        int cantidad = scanner.nextInt();

        puntoEj5[] puntos;
        puntos = new puntoEj5[cantidad];

        for (int i = 0; i < puntos.length-1 ; i++ ) {
            puntos[i] = new puntoEj5(random.nextInt(11), random.nextInt(11));
            puntos[i].muestra();
        }
    }
}
