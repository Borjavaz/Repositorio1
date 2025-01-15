import java.util.Scanner;

/**
 * Este programa te indica el porcentaje descontado
 *
 * @author Borja de Saa
 * @version 1.1
 */

public class Boletin2 {
    public static void main(String[] args) {

        System.out.println("ej1");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce o prezo da tarifa: ");
        double prezoTarifa = scanner.nextDouble();


        System.out.print("Introduce o prezo pagado: ");
        double prezoPagado = scanner.nextDouble();


        double desconto = prezoTarifa - prezoPagado;
        double porcentaxeDescontada = (desconto / prezoTarifa) * 100;

        System.out.println("Porcentaxe descontada: " + porcentaxeDescontada + "%");
        System.out.println("O desconto total é de " + desconto + "€");

/**
 * Este programa te pasa la temperatura en grados centigrados a Fahrenheit y a Kelvin
 */

        System.out.println();
        System.out.println("ej2");


        System.out.print("Introduce a temperatura en graos centígrados: ");
        double temperaturaC = scanner.nextDouble();

        double temperaturaF = (temperaturaC * 9 / 5) + 32;


        double temperaturaK = temperaturaC + 273.15;


        System.out.printf("Temperatura en Fahrenheit: %.2f °F\n", temperaturaF);
        System.out.printf("Temperatura en Kelvin: %.2f K\n", temperaturaK);

        /**
         * Este programa cuanta el numero de billetes y te dice el dinero total
         */

        System.out.println();
        System.out.println("ej3");


        System.out.print("Introduce o número de billetes de 100 €: ");
        int billetes100 = scanner.nextInt();

        System.out.print("Introduce o número de billetes de 20 €: ");
        int billetes20 = scanner.nextInt();

        System.out.print("Introduce o número de billetes de 5 €: ");
        int billetes5 = scanner.nextInt();

        System.out.print("Introduce o número de moedas de 1 €: ");
        int moedas1 = scanner.nextInt();


        int totalEuros = (billetes100 * 100) + (billetes20 * 20) + (billetes5 * 5) + (moedas1 * 1);


        System.out.println("Total en euros: " + totalEuros + " €");

/**
 * Este programa te desglosa una cantidad de dinero en billetes y monedas
 */

        System.out.println();
        System.out.println("ej4");


        System.out.print("Introduce a cantidade en euros: ");
        int cantidad = scanner.nextInt();

        int billete100 = cantidad / 100;
        cantidad %= 100;

        int billete20 = cantidad / 20;
        cantidad %= 20;

        int billete5 = cantidad / 5;
        cantidad %= 5;

        int monedas1 = cantidad;


        System.out.println("Desglose:");
        System.out.println("Billetes de 100 €: " + billete100);
        System.out.println("Billetes de 20 €: " + billete20);
        System.out.println("Billetes de 5 €: " + billete5);
        System.out.println("Monedas de 1 €: " + monedas1);


    }
}