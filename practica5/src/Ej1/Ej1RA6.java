package Ej1;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.sort;


public class Ej1RA6 {
    public static void main (String[] args) {
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        //introduccion de numeros habitantes
        System.out.print("Intorduce numero de habitantes: ");
        int habitantes = scanner.nextInt();

        //Creacion de array
        Integer[] sueldos = new Integer[habitantes];

        //Introduccion de sueldos
        for (int i = 0 ; i < habitantes; i++) {
            System.out.print("Introduce saldo del habitante " + (i+1) + ": ");
            sueldos[i] = scanner.nextInt();
        }

        //Ordena e invierte sueldos
        sort(sueldos, Collections.reverseOrder());

        //Muestra suldos en orden descendiente
        System.out.println("Saldos de los habitantes en orden decendiente: ");
        for (int i = 0 ; i < habitantes; i++) {
            System.out.println(sueldos[i]);
        }

        //Como ya tengo lista ordenada me puedo permetir mostrar resultados de esa manera, lo suyo seria crear un if else
        //dentro de un for donde haria un filtro
        System.out.println("Sueldo Maximo: " + sueldos[0]  + " Sueldo Minimo: " + sueldos[sueldos.length-1]);


        //Suma todos los sueldos y los divide directamente en el print
        for (int i=0; i < habitantes; i++) {
            suma += sueldos[i];
        }
        System.out.println("Sueldo medio de habitantes es de: " + suma/habitantes);
    }
}
