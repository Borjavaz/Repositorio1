import java.util.Scanner;

/**
 * Este programa calcula el area de un triangulo del que ya sabemos su base y su altura
 * @version 1.1
 * @author Borja de Saa
 */
public class Boletin1 {
    /**
     * Funcion principal
     * @param args datos del triangulo
     */
    public static void main (String [] args){
        //base = 4, altura = 3, area;
        double base, altura, area;
        base = 4;
        altura = 3;
        area = base * altura / 2;
        System.out.println(area);
        System.out.println("El area del triangululo es  " + area);

        //Este programa sirve para cambiar de euros a dolares y de dolares a euros

        System.out.println();
        System.out.println("ej3");

        double cambio, euros, dolares;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio euro-dolar do día de hoxe:");
        cambio = entradaTeclado.nextDouble();
        System.out.println("Introduce a cantidade de euros a cambiar:");
        euros = entradaTeclado.nextDouble();
        dolares = euros*cambio;
        System.out.println(dolares +" dolares de cambio, por "+ euros+ " Euros.");
        entradaTeclado.close();
    }
}