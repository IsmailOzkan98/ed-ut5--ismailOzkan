package Ej5;

public class puntoEj5 {
    //variables
    private double x;
    private double y;

    //constructo
    public puntoEj5(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }
    //metodos que desplazan en eje concreto
    public void desplazaX(double dx) {
        x += dx;
    }
    public void desplazaY(double dy) {
        y += dy;
    }
    //metodos que desplazan en 2 ejes al mismo tiempo
    public void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }
    //mide distancia entre 2 puntos
    double distanciaEuclidea(puntoEj5 otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist;
    }
    //muestra posicion actual del punto
    public void muestra() {
        System.out.println("La coordenada se situa en /coord X = " + x + " /coord Y = " + y);
    }

}
