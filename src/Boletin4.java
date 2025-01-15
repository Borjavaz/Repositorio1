import java.util.Scanner;

/**
 * Este programa te dice el consumo de un producto segun sus ventas
 * @version 1.1
 * @author Borja de Saa
 */

public class Boletin4 {
    public static void main(String[] args) {

        Scanner Boletin4 = new Scanner(System.in);

        System.out.println();
        System.out.println("ej1");


        System.out.println("Escriba un número de vendas anuais para saber o consumo do producto:");
        int vendas = Boletin4.nextInt();

        if (vendas <= 100) {
            System.out.println(" consumo baixo ");
        }
        else if (vendas > 100 && vendas <= 500){
            System.out.println(" consumo medio ");
        }
        else if (vendas > 500 && vendas <= 1000){
            System.out.println(" consumo alto ");
        }

        else{
            System.out.println( " primeira necesidade");
        }

        /**
         * Este programa calcula el area de un cuadrado, un triangulo o un circulo.
         */


        System.out.println();
        System.out.println("ej2");

        System.out.println(" Si quiere calcular el area de un cuadrado pulse 1\n Si quiere alcular el area de un triangulo pulse 2\n Si quiere alcular el area de un circulo pulse 3 ");
        int area = Boletin4.nextInt();


        switch (area){

            case 1:
                System.out.println("Escriba la base de su cuadrado");
                int baseCuadrado = Boletin4.nextInt();
                System.out.println("Escriba la altura de su cuadrado");
                int alturaCuadrado = Boletin4.nextInt();

                System.out.println(" El area del cuadrado es: " + baseCuadrado * alturaCuadrado);

                break;

            case 2:
                System.out.println("Escriba la base de su triangulo");
                int baseTriangulo = Boletin4.nextInt();
                System.out.println("Escriba la altura de su triangulo");
                int alturaTriangulo = Boletin4.nextInt();

                System.out.println(" El area del trangulo es: " + baseTriangulo * alturaTriangulo / 2);

                break;

            case 3:
                System.out.println("Escriba el radio de su circulo");
                double radioCirculo = Boletin4.nextDouble();

                System.out.println(" El area del circulo es: " + Math.PI * Math.pow(radioCirculo, 2));

                break;


        }


        /**
         * Este programa te dice el consumo de un producto segun sus ventas
         */

        System.out.println();
        System.out.println("ej3");
        System.out.println();
        System.out.println("Escribe un numero para saber su valor absoluto: ");
        int num = Boletin4.nextInt();

        if (num > 0){
            System.out.println("El valor absoluto de tu numero es = " + num );
        }
        else {
            System.out.println("El valor absoluto de tu numero es = " + num * -1 );
        }


        /**
         * Este programa pasa un número de digitos a letras
         */

        System.out.println();
        System.out.println("ej4");

        System.out.println("Introduzca las decenas de su número (0-9): ");
        int decenas = Boletin4.nextInt();
        System.out.println("Introduzca el número de las unidades (0-9): ");
        int unidades = Boletin4.nextInt();

        String nombreDecenas = "";
        String nombreUnidades = "";

        switch (decenas) {
            case 1:
                nombreDecenas = "diez";
                break;
            case 2:
                nombreDecenas = "veinte";
                break;
            case 3:
                nombreDecenas = "treinta";
                break;
            case 4:
                nombreDecenas = "cuarenta";
                break;
            case 5:
                nombreDecenas = "cincuenta";
                break;
            case 6:
                nombreDecenas = "sesenta";
                break;
            case 7:
                nombreDecenas = "setenta";
                break;
            case 8:
                nombreDecenas = "ochenta";
                break;
            case 9:
                nombreDecenas = "noventa";
                break;
            default:
                nombreDecenas = "decenas no válidas";
        }

        switch (unidades) {
            case 1:
                nombreUnidades = "uno";
                break;
            case 2:
                nombreUnidades = "dos";
                break;
            case 3:
                nombreUnidades = "tres";
                break;
            case 4:
                nombreUnidades = "cuatro";
                break;
            case 5:
                nombreUnidades = "cinco";
                break;
            case 6:
                nombreUnidades = "seis";
                break;
            case 7:
                nombreUnidades = "siete";
                break;
            case 8:
                nombreUnidades = "ocho";
                break;
            case 9:
                nombreUnidades = "nueve";
                break;
            default:
                nombreUnidades = "unidades no válidas";
        }

        System.out.println("El número es " + nombreDecenas + " y " + nombreUnidades);


        /**
         * Este programa te dice la letra correspondiente a tu DNI
         */

        System.out.println();
        System.out.println("ej5");
        System.out.println();
        System.out.println("Escribe el numero de tu DNI para saber la letra correspondiente: ");
        int nDNI = Boletin4.nextInt();
        nDNI = nDNI % 23;

        switch (nDNI){

            case 0 -> System.out.println("La letra de tu DNI es : T");
            case 1 -> System.out.println("La letra de tu DNI es : R");
            case 2 -> System.out.println("La letra de tu DNI es : W");
            case 3 -> System.out.println("La letra de tu DNI es : A");
            case 4 -> System.out.println("La letra de tu DNI es : G");
            case 5 -> System.out.println("La letra de tu DNI es : M");
            case 6 -> System.out.println("La letra de tu DNI es : Y");
            case 7 -> System.out.println("La letra de tu DNI es : F");
            case 8 -> System.out.println("La letra de tu DNI es : P");
            case 9 -> System.out.println("La letra de tu DNI es : D");
            case 10 -> System.out.println("La letra de tu DNI es : X");
            case 11 -> System.out.println("La letra de tu DNI es : B");
            case 12 -> System.out.println("La letra de tu DNI es : N");
            case 13 -> System.out.println("La letra de tu DNI es : J");
            case 14 -> System.out.println("La letra de tu DNI es : Z");
            case 15 -> System.out.println("La letra de tu DNI es : S");
            case 16 -> System.out.println("La letra de tu DNI es : Q");
            case 17 -> System.out.println("La letra de tu DNI es : V");
            case 18 -> System.out.println("La letra de tu DNI es : H");
            case 19 -> System.out.println("La letra de tu DNI es : L");
            case 20 -> System.out.println("La letra de tu DNI es : C");
            case 21 -> System.out.println("La letra de tu DNI es : K");
            case 22 -> System.out.println("La letra de tu DNI es : E");


        }

        Boletin4.close();

    }
}