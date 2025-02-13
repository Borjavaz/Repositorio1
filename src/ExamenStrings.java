import java.util.Scanner;

public class ExamenStrings {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Ejercicio1();
        System.out.println("Ejercicio 2");
        Ejercicio2();
        System.out.println("Ejercicio 3");
        Ejercicio3();
    }

    public static void Ejercicio1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una frase para mostrar su acrónimo:");
        String frase1 = scanner.nextLine();
        System.out.println("Su acrónimo es:");
        PrimerasLetras(frase1);
    }

    public static void PrimerasLetras(String frase1) {
        String[] frases = frase1.split(" ");
        String resultado = "";
        for (int i = 0; i < frases.length; i++) {
            resultado += frases[i].charAt(0);
        }
        System.out.println(resultado.toUpperCase());
    }

    public static void Ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena para recibir la cadena invertida:");
        String cadena1 = scanner.nextLine();
        System.out.println("La cadena invertida es: ");
        cadeaInvertida(cadena1);


    }
    public static void cadeaInvertida(String cadena1) {
        String cadena2 = new StringBuilder(cadena1).reverse().toString();
        System.out.println(cadena2);
    }
    public static void Ejercicio3() {
        System.out.println("Escribe una cadena para contar vocales:");
        Scanner scanner = new Scanner(System.in);
        String cadena2 = scanner.nextLine();
        iniciales(cadena2);

    }
    public static void iniciales(String cadena2){
        String[] cadenas = cadena2.split(" ");
        String resultado = "";
        for (int i = 0; i < cadenas.length; i++) {
            resultado += cadenas[i].charAt(0);
        }
        System.out.println(resultado.toUpperCase());
    }
}