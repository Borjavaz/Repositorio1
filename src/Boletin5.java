import java.util.Scanner;

/**
 * Este programa calcula la cantidad de numeros positivos, negativos y ceros
 *
 * @author Borja de Saa
 * @version 1.1
 */

public class Boletin5 {
    public static void main(String[] args) {
        Scanner Boletin5 = new Scanner(System.in);

        System.out.println("ej1");
        System.out.println("");
        System.out.println("Escribe 10 numeros para saber la cantidad de positivos, negativos y ceros");
        System.out.println("");
        //Declaramos una variable para cada caso
        int contador1 = 0;
        int contadorneg = 0;
        int contadorpos = 0;
        int contador0 = 0;
        //Creamos un bucle que se ejecute 10 veces
        while (contador1 < 10) {
            System.out.println("Introduzca un numero: ");
            double num = Boletin5.nextDouble();
            contador1++;
            //Si el numero es menor que cero, su contador aumenta una unidad
            if (num < 0) {
                contadorneg++;
                //Si el numero es mayor que 0, su contador aumenta una unidad
            } else if (num > 0) {
                contadorpos++;
                //Si el numero es 0, su contador aumenta una unidad
            } else {
                contador0++;
            }
        }
        //Mostramos por pantalla la cantidad de positivos, negativos y ceros (contados previamente)
        System.out.println("La cantidad de numeros negativos es: " + contadorneg);
        System.out.println("La cantidad de numeros positivos es: " + contadorpos);
        System.out.println("La cantidad de ceros es: " + contador0);

// Este programa calcula la suma y el producto de dos numeros comprendidos entre 10 y 90

        System.out.println("");
        System.out.println("ej2");
        System.out.println("");
        System.out.println("Escribe 2 numeros entre el 10 y 90 para calcular su suma y su producto");


        System.out.println("Introduzca el primer numero: ");
        int num1_2 = Boletin5.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2_2 = Boletin5.nextInt();

        System.out.println("");
        System.out.println("El resultado de la suma de estos dos numeros es: " + (num1_2 + num2_2));
        System.out.println("");
        System.out.println("El resultado del producto de estos dos numeros es: " + (num1_2 * num2_2));


// Este programa calcula el area de un rectangulo
        System.out.println("");
        System.out.println("ej3");

        System.out.println("Introduzca la base del rectangulo: ");
        double base = Boletin5.nextDouble();
        System.out.println("Introduzca la altura del rectangulo: ");
        double altura = Boletin5.nextDouble();

        double resultado;

        if (base > 0 && altura > 0) {
            resultado = base * altura;
            System.out.println("El area del rectangulo es: " + resultado);
        } else {
            System.out.println("El area del rectangulo no puede llevar numeros negativos");
        }

        // Este programa la tabla de multiplicar de un numero
        System.out.println("");
        System.out.println("ej4");

        System.out.println("Introduzca un numero entre 0 y 10 para obtener su tabla de multiplicar");
        int num1_4 = Boletin5.nextInt();


        for (int i = 0; i <= 10; i++) {
            int resmulti = num1_4 * i;
            System.out.println(num1_4 + " X " + i + " = " + resmulti);
        }

        // Este programa realiza un analisis de los sueldos de los trabajadores de una empresa
        System.out.println("");
        System.out.println("ej5");

        int sueldo;
        int contador = 0;
        int contador1_5 = 0;
        double contador2_5 = 0;

        do {
            System.out.println("Introduzca el sueldo del trabajador: ");
            sueldo = Boletin5.nextInt();
            contador++;

            if (sueldo >= 1000 && sueldo <= 1750) {

                contador1_5++;

            } else if (sueldo <= 1000) {

                contador2_5++;

            }
        } while (sueldo != 0);

        System.out.println("El numero de trabajadores con un salario entre 1000 y 1750 € es: " + contador1_5);
        System.out.println("El porcentaje de personas que cobra menos de 1000€ es: " + contador * contador2_5 / 100 + " % ");

        // Este programa realeza el factorial de un numero
        System.out.println("");
        System.out.println("ej6");

        System.out.println("");
        System.out.println("ej6");

        System.out.println("introduzca un numero para obtener su factorial: ");
        int num1_6 = Boletin5.nextInt();

        int contador1_6 = 1;
        int operacion1_6 = 1;

        while (contador1_6 <= num1_6) {
            operacion1_6 = contador1_6 * operacion1_6;
            contador1_6++;
        }

        System.out.println("El factorial de " + num1_6 + " es: " + operacion1_6);

        // Este programa crea un triangulo de la base y altura que tu quieras
        System.out.println("");
        System.out.println("ej7");

        System.out.println("Escriba un numero para obtener un triangulo con esa base y la misma alutura: ");
        int num1_7 = Boletin5.nextInt();

        for (int i = 1; i <= num1_7; i++) {

            for (int j = 1; j <= num1_7 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}