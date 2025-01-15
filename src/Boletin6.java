import java.util.Scanner;


public class Boletin6 {


    //Escribir unha función o que se lle pasen dous enteiros e mostre tódolos números comprendidos entre eles.
    public static void mostrarNumerosEntre(int num1, int num2) {
        // Asegurarse de que num1 es menor que num2 para que funcione correctamente
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }


        // Mostrar los números comprendidos entre num1 y num2
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }


    //EJERCICIO 2
    // Función que imprime "Ecoo..." n veces


    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ecoo...");
        }
    }


    public static void cubo(int opcion,int lado){
        if(opcion == 1){
            int area= 6 * (lado*lado);
            System.out.println("El area del cubo es: " + area + " ^2");
        }else if(opcion == 2){
            int volumen= lado*lado*lado;
            System.out.println("El volumen del cubo es: " + volumen + " ^3");
        }else{
            System.out.println("Introduzca 1 o 2");
            return;
        }
    }
    public static void contadorSegundos(int dias,int horas, int minutos){


        double diasSegundos = dias*86400;//Pasar de dias a segundos
        double horasSegundos = horas*3600;//Pasar de horas a segundos
        double minutosSegundos = minutos*60;//Pasar de minutos a segundos


        double resultadoSegundos = diasSegundos + horasSegundos + minutosSegundos;//Sumar todos los segundos


        System.out.println("Esto son " + resultadoSegundos + " segundos.");
    }
    public static void diferenciaMin(int hora1,int minuto1,int hora2,int minuto2){


        int horaMinuto1= hora1 * 60;
        int horaMinuto2= hora2 * 60;
        if(horaMinuto1+minuto1>horaMinuto2+minuto2){
            int diferencia1 = (horaMinuto1+minuto1)-(horaMinuto2+minuto2);
            System.out.println("La diferencia es de " + diferencia1 + " minutos");


        }else if(horaMinuto1+minuto1<horaMinuto2+minuto2){
            int diferencia2 = (horaMinuto2+minuto2)-(horaMinuto1+minuto1);
            System.out.println("La diferencia es de " + diferencia2 + " minutos");
        }else{
            System.out.println("La cantidad de minutos es la misma");
        }
    }

    public static void main(String[] args) {
        Scanner Boletin6=new Scanner(System.in);


        System.out.println("ej1");
        int num1 = 5;
        int num2 = 10;
        mostrarNumerosEntre(num1, num2);


        // Llamada a la función con un ejemplo de 3 repeticiones
        System.out.println("ej2");
        eco(3);


        // Pide la opcion y la distancia del lado para calcular el area o el volumen de un cubo
        System.out.println("ej3");
        cubo(3,5);


        //Pasa de dias, horas y minutos a segundos
        System.out.println("ej4");
        contadorSegundos(100,4,45);


        //Te muestra la diferencia de minutos entre dos horas
        System.out.println("ej5");
        diferenciaMin(1,5,1,7);


        System.out.println("ej6");

    }
}
