package Ej2;

import java.util.Scanner;

public class Ej1RA6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] notas = new int[5][3];

        //introduccion de notas
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Introduce Nota del alumno " + (i+1) + " de trimestre " + (j+1) + ": ");
                notas[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        //Calculo Media de Cada Alumno
        for (int i = 0; i < notas.length; i++) {
            double sumaAlu = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sumaAlu += notas[i][j];
            }
            System.out.println("La media de alumno "  + (i+1) + " es de: " + (sumaAlu/notas[i].length));
        }

        //Calculo media de grupo en cada trimestre
        for (int j = 0; j < notas[0].length; j++) {
            double sumaGru = 0;
            for (int i = 0; i < notas.length; i++) {
                sumaGru += notas[i][j];
            }
            System.out.println("La media del grupo en trimestre "  + (j+1) + " es de: " + (sumaGru/notas.length));
        }
    }
}
