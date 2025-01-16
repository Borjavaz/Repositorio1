import java.util.Scanner;

public class Boletin8_2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        Ejercicio10();
        Ejercicio11();
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
    public static void Ejercicio11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre y tu apellido:");
        String nombreYapellido=scanner.nextLine();
        nombreYapellido = corregir(nombreYapellido);
        System.out.println("El nombre y apellido sin espacios y en mayusculas es: " + nombreYapellido);
    }
    public static String corregir(String nombreYapellido){
        return nombreYapellido.toUpperCase().replace(" ","");
    }
    public static void Ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto que quieras analizar: ");
        String texto = scanner.nextLine();
        contarPalabras(texto);
        System.out.println("El texto tiene ");

    }
    public static void contarPalabras (String texto){
        int cantidadDeEspacios=0;
        for (int i =0; i<texto.length();i++){
            if (texto.charAt(i) == ' ') cantidadDeEspacios++;
        }
    }
    public static void contarCaracteres(String texto){

    }
    /*public static String palabraMasLarga(String texto){

    }*/
}

