package Ej5;

public class puntoAppEj5 {
    public static void main(String[] args) {
        puntoEj5 punto = new puntoEj5(2,1);
        puntoEj5 puntoTest = new puntoEj5(79, 23);


        punto.muestra();
        punto.desplaza(3,7);
        punto.muestra();
        punto.desplazaX(4);
        punto.muestra();
        punto.desplazaY(2);
        punto.muestra();

        System.out.println("distancia entre puntos es de: " + punto.distanciaEuclidea(puntoTest));
        punto.muestra();
    }

}
