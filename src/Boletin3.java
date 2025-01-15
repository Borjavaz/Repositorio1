import java.util.Scanner;

/**
 * Este programa te dice si un numero es positivo o negativo
 *
 * @author Borja de Saa
 * @version 1.1
 */

public class Boletin3 {
    public static void main(String[] args) {
        Scanner Boletin3 = new Scanner(System.in);
        System.out.println("ej1");


        System.out.println("Escriba un número para saber si es positivo o negativo:");
        int numero = Boletin3.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es positivo");
        } else {
            System.out.println(numero + " es negativo");
        }

        /**
         * Este programa te suma los 2 numeros si el primero es mayor que el segundo, si no te los resta
         */

        System.out.println();
        System.out.println("ej2");

        System.out.println("escriba un número entre -32000 y 32000");
        short num1 = Boletin3.nextShort();
        System.out.println("escriba otro número entre -32000 y 32000");
        short num2 = Boletin3.nextShort();

        if (num1 >= num2) {
            System.out.println("el resultado es " + (num1 - num2));
        } else {
            System.out.println("el resultado es " + (num1 + num2));
        }

        /**
         * Este programa te dice el signo correspondiente a tu numero
         */

        System.out.println();
        System.out.println("ej3");


        System.out.println("Escriba un número para saber si es positivo o negativo:");
        int numero1 = Boletin3.nextInt();

        if (numero1 > 0) {
            System.out.println(" + ");
        } else if (numero1 < 0) {
            System.out.println(" - ");
        } else {
            System.out.println("El número es 0 ");
        }

        Boletin3.close();

/**
 * Este programa dice quien pesa mas entre dos personas y la diferencia de peso
 */

        System.out.println();
        System.out.println("ej4");


        String nombre1 = "Borja de Saá";
        int peso1 = 62;

        String nombre2 = "Manuel Carrera";
        int peso2 = 65;

        if (peso1 > peso2) {
            System.out.println(nombre1 + " pesa más que " + nombre2 + " con una diferencia de " + (peso1 - peso2));
        } else if (peso1 < peso2) {
            System.out.println(nombre2 + " pesa más que " + nombre1 + " con una diferencia de " + (peso2 - peso1));
        }

        /**
         * Este programa detecta cual es el mayor entre tres numeros
         */

        System.out.println();
        System.out.println("ej5");


        int numerito1 = 5;
        int numerito2 = 3;
        int numerito3 = 7;

        if (numerito1 > numerito2 && numerito1 > numerito3) {
            System.out.println(numerito1 + " es mayor que " + numerito2 + " y que " + numerito3);
        } else if (numerito2 > numerito1 && numerito2 > numerito3) {
            System.out.println(numerito2 + " es mayor que " + numerito1 + " y que " + numerito3);
        } else if (numerito3 > numerito1 && numerito3 > numerito2) {
            System.out.println(numerito3 + " es mayor que " + numerito1 + " y que " + numerito2);
        }

        System.out.println();
        System.out.println("ej4.2");

        String nombre_1 = "Borja de Saá";
        int peso_1 = 62;

        String nombre_2 = "Manuel Carrera";
        int peso_2 = 65;

        String resultado = (peso1 > peso2)
                ? nombre_1 + " pesa más que " + nombre_2 + " con una diferencia de " + (peso_1 - peso_2) + " kg"
                : (peso_1 < peso_2)
                ? nombre_2 + " pesa más que " + nombre_1 + " con una diferencia de " + (peso_2 - peso_1) + " kg"
                : nombre_1 + " y " + nombre_2 + " pesan lo mismo.";

        System.out.println(resultado);


    }
}