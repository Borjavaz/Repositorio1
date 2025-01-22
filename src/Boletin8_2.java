import java.util.Scanner;

public class Boletin8_2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        Ejercicio10();
        System.out.println("Ejercicio 11");
        Ejercicio11();
        System.out.println("Ejercicio 12");
        Ejercicio12();
    }

    public static void Ejercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una contraseña con los siguientes requisitos: "
                + "\n 1- Mínimo 8 caracteres"
                + "\n 2- Como mínimo 1 mayúscula"
                + "\n 3- Como mínimo 1 minúscula"
                + "\n 4- Como mínimo un número");

        String contraseña = scanner.nextLine();

        boolean primeraValidacion = validarLongitud(contraseña);
        boolean segundaValidacion = validarMayusculas(contraseña);
        boolean terceraValidacion = validarMinusculas(contraseña);
        boolean cuartaValidacion = validarNumeros(contraseña);

        if (primeraValidacion == true && segundaValidacion == true && terceraValidacion == true && cuartaValidacion == true) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña no válida, introduce una contraseña valida");
            Ejercicio10();
        }
    }

    public static boolean validarLongitud(String contraseña) {
        return contraseña.length() >= 8;
    }

    public static boolean validarMayusculas(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarMinusculas(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isLowerCase(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarNumeros(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static void Ejercicio11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el apellido:");
        String apellido = scanner.nextLine();

        String nomFormateado = formatear(nombre, apellido);
        System.out.println("Nombre formateado: " + nomFormateado);
    }

    public static String formatear(String nombre, String apellido) {
        nombre = primeraMayuscula(nombre.replace(" ", ""));
        apellido = primeraMayuscula(apellido.replace(" ", ""));
        return nombre + " " + apellido;
    }

    public static String primeraMayuscula(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
    public static void Ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto que quieras analizar: ");
        String texto = scanner.nextLine();

        int numeroDePalabras = contarPalabras(texto);
        int numeroDeCaracteres = contarCaracteres(texto);
        String palabraMasLarga = encontrarPalabraLarga(texto);

        System.out.println("El número de palabras es: " + numeroDePalabras);
        System.out.println("El numero de caracteres es: " + numeroDeCaracteres);
        System.out.println("La palabra más larga es: " + palabraMasLarga);

    }
    public static int contarPalabras(String texto) {
            if (texto == null || texto.isEmpty()) {
                return 0;
            }
            String[] palabras = texto.trim().split("\\s+");
            return palabras.length;
        }
    public static int contarCaracteres(String texto){
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        return texto.length();
    }
    public static String encontrarPalabraLarga(String texto){
        String[] palabras = texto.trim().split("\\s+");
        int contador = palabras.length;
        String palabralarga= "";
        for (int i =0; i<contador;i++){
            if(palabras[i].length()>palabralarga.length()){
                palabralarga=palabras[i];
            }
        }
        return palabralarga;
    }

}

