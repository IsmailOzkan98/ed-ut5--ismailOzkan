package Ej3;

public class Ej3RA6 {
    public static void main (String[] args) {
        String test = "este texto es para una prueba";

        //1. devuelve un char con index especifico    e s t e  "t"e x t o
        System.out.println(test.charAt(5));        // 0 1 2 3 4 5 6 7 8 9

        //2. convierte todos caracteres de esa String en mayusculas
        System.out.println(test.toUpperCase());

        //3. devuelve la longitud de la cadena
        System.out.println(test.length());

        //4. devuleve la primera posicion del caracter solicitado    e s t e   t e"x"t o
        System.out.println(test.indexOf('x'));                    // 0 1 2 3 4 5 6"7"8 9

        //5. devuelve la posicion de primera aparecion del caracter apartir de posicion solicitada      e s t e   t"e"x t o
        System.out.println(test.indexOf('e', 4));                                       // 0 1 2 3'4'5"6"7 8 9

        //6. devuelve string "cortada" usando de referencia delimitador indicado
        String[] text2 = test.split("e");
        for (String text1 : text2) {
            System.out.println(text1);
        } // para que metodo funccione me toco generar nuevo array y recorerlo

        //7. cambia char seleccionado por uno que elijas tu
        System.out.println(test.replace('e', 'A'));

        //8. este metodo extrae cadena en rango que indicas
        System.out.println(test.substring(4, 11)); //en este caso lo he extraido con espacios

        //9. comprueba si cadena empieza con "palabra" en concreto
        System.out.println("empieza con palabra 'este' ? " + test.startsWith("este"));

        //10. comprueba si string contiene "palabra" que necesitas
        System.out.println("la frase contiene palabra 'patata' ? " + test.contains("patata"));

        //11. he usado 2 veces indexOf asi que por si acaso uso otro metodo mas
        // este metodo permite encontrar "palabra" que le indicas y reemplazarla por otra
        System.out.println(test.replaceFirst("prueba", "PATATAAAAAAA"));

       //System.out.println(test);

    }
}
