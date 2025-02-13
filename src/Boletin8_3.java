import java.util.Scanner;

public class Boletin8_3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        ejercicio1();
        System.out.println("Ejercicio 2");
        ejercicio2();
    }
    public static void ejercicio1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escriba una palabra para dividirla en secuencias: ");
        String palabra = scanner.nextLine();
        System.out.println("De cuantos dígitos quieres la secuenciia? ");
        int Nsecuencia = scanner.nextInt();

        String [] secuencias = new String[Nsecuencia];
        for(int i = 0; i<=palabra.length()-Nsecuencia;i++){
            String subsecuencia = palabra.substring(i,i+Nsecuencia);
            System.out.println(subsecuencia);
        }
    }
    public static void ejercicio2(){
       String texto = "Esto es una prueba\ny esta es otra linea";
        String[] partes = texto.split("\n", 2);

        if(partes.length>0){
            partes[0]= partes[0].toUpperCase();
        }
        if (partes.length>1){
            partes[1]=partes[1].toLowerCase();
        }
        System.out.println("Resultado:");
        for(String parte: partes){
            System.out.println(parte);
        }
    }
}
