public class Boletin8 {
    public static void main(String[] args) {
        System.out.println("ej1");
        System.out.println(" ");
        String nome1 = " Isto é Java!";
        System.out.println("La longitud de " + nome1 + " es de : " + nome1.length() + " caracteres");

        System.out.println(" ");
        System.out.println("ej2");
        System.out.println(" ");
        String nome2 = "Java";

        System.out.println("Primera opcion");
        for (int i = 0; i < nome2.length(); i++) {
            System.out.println(nome2.charAt(i));
        }
        System.out.println("Segunda opcion");
        for (int i = 0; i < nome2.length(); i++) {
            System.out.print(nome2.charAt(i) + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("ej3");
        System.out.println(" ");
        String nome3 = "Java dende 0";
        String nome3Invertido = new StringBuilder(nome3).reverse().toString();
        System.out.println("Texto invertido: " + nome3Invertido);

        System.out.println(" ");
        System.out.println("ej4");
        System.out.println(" ");
        String nome4 = "James Gosling Created Java";
        String nome4sinEspacios = nome4.replace(" ", "");
        System.out.println("Texto sin espacios: " + nome4sinEspacios);

        System.out.println(" ");
        System.out.println("ej5");
        System.out.println(" ");

        String nome5 = "Hola Mundo";
        int vocales = 0;
        int consonantes = 0;

        // Convertimos el texto a minúsculas para simplificar la comparación
        nome5 = nome5.toLowerCase();

        // Recorremos el texto carácter a carácter
        for (int i = 0; i < nome5.length(); i++) {
            char c = nome5.charAt(i);

            // Verificamos si es una letra
            if (Character.isLetter(c)) {
                // Si es vocal
                if (esVocal(c)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        System.out.println(" ");
        System.out.println("ej6");
        System.out.println(" ");

        String nome6 = " www. javadende0. com";

        String parte1 = nome6.substring(0,10);
        String parte2 = nome6.substring(10);
        System.out.println(parte1);
        System.out.println(parte2);
        System.out.println("Todo junto:" + parte1 + parte2);

        System.out.println(" ");
        System.out.println("ej7");
        System.out.println(" ");
        String nome7 = "javeros";
        String nome7EnMayusculas = nome7.toUpperCase();
        System.out.println("Texto en mayúsculas: " + nome7EnMayusculas);

        System.out.println(" ");
        System.out.println("ej8");
        System.out.println(" ");

        String texto1 = "Java";
        String texto2 = "JavaScript";
        // Comparación
        System.out.println(texto1.equals(texto2));

        System.out.println(" ");
        System.out.println("ej9");
        System.out.println(" ");
        String nome9= " Jeve jeve jeve";
        // Reemplazamos todas las vocales por 'a' (mayúsculas y minúsculas)
        String resultado = nome9.replaceAll("[aeiouAEIOU]", "a");

        System.out.println("Texto original: " + nome9);
        System.out.println("Texto modificado: " + resultado);

        System.out.println(" ");
        System.out.println("ej10");
        System.out.println(" ");
    }
    public static boolean esVocal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}