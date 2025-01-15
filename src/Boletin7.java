import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Boletin7 {
    public static void main(String[] args) {

        Scanner Boletin7 = new Scanner(System.in);

        //Este programa contiene un array que se visualiza del reves
        System.out.println("");
        System.out.println("ej1");
        int[] numeros = new int[6];
        numeros[0] = 23;
        numeros[1] = 43;
        numeros[2] = 4;
        numeros[3] = 34;
        numeros[4] = 22;
        numeros[5] = 12;
        System.out.println("");
        System.out.println("Array");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int[] inverso = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            inverso[i] = numeros[numeros.length - 1 - i];
        }
        System.out.println("");
        System.out.println("Array inverso");
        for (int num : inverso) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("ej2 y ej3");

        int[] notas = {2, 5, 8, 1, 9, 7, 3, 10, 4, 6, 0, 8, 5, 10, 2, 6, 9, 7, 3, 4, 1, 10, 3, 6, 8, 4, 7, 2, 9, 0};
        String[] nomes = {"Saray", "Saul", "Anton", "Adriana", "Ivan", "Daniel", "Daniel", "Piero", "Jorge", "Fernando", "Sofia", "Javier", "Oscar", "Andrea", "Karly", "Alexandre", "Ivan", "Borja", "Manuel", "Carlos", "Fran", "Miguel", "Samuel", "Jose", "Dima", "Oliver", "David", "Adrian", "Gael", "Adrian"};

        int aprobados = 0;
        int suspensos = 0;
        int sumaNotas = 0;
        int notaMasAlta = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            sumaNotas += notas[i];

            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }

        }
        double mediaClase = (double) sumaNotas / notas.length;

        System.out.println("\nResultados de la clase:");
        System.out.println("\nNúmero de aprobados: " + aprobados);
        System.out.println("\nNúmero de suspensos: " + suspensos);
        System.out.println("\nNota media de la clase: " + mediaClase);
        System.out.println("\nNota más alta: " + notaMasAlta);


        //Bucle que muestra el nombre de las personas aprobadas
        System.out.println("\nLista de alumnos aprobados:");
        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nomes[i] + " - Nota: " + notas[i]);

            }
        }

        System.out.println("\nEscribe el nombre de un alumno para saber su nota:");
        String nombreAlumno = Boletin7.nextLine();
        String alumno = null;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nombreAlumno)) {
                alumno = nomes[i];
                System.out.println("La nota de " + alumno + " es: " + notas[i]);
                break;
            }
        }
        if (alumno == null) {
            System.out.println("El alumno " + nombreAlumno + " no está en la lista.");
        }

        int[] notasOrdenadas = Arrays.copyOf(notas, notas.length);
        Arrays.sort(notas);
        System.out.println("\nEsta es una lista con las notas ordenadas de menor a mayor" + Arrays.toString(notas));

        //Este programa calcula la letra de tu DNI
        System.out.println("\nej4");

        System.out.println("\nIntroduzca el numero de su DNI: ");
        int dni = Boletin7.nextInt();

        int numDNI= dni%23;

        String[] letraDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        for(int i = 0; i< letraDNI.length;i++){
            if(i == numDNI){
                System.out.println("\nLa letra de tu DNI es: " + letraDNI[i]);
                break;}
        }

        System.out.println("\nej5");
        System.out.println("|nIntroduce un numero del 1 al 5 para saber quien quedo en esa posicion: ");
        int x= Boletin7.nextInt();

        String[] nomLista={"Manu","Borja","Xian","Pedro","Marcos"};

        for(int i = 0; i<nomLista.length; i++){
            if(i == x){
                System.out.println("\nEsta posicion le corresponde a: " + nomLista[i - 1]);
                break;}
        }

        System.out.println("\nej7");
        int[] matriz = {1, 2, 3, 4, 5};

        // Copiar la matriz original a una nueva matriz con el mismo tamaño
        int[] copiaMatriz = Arrays.copyOf(matriz, matriz.length);

        System.out.println(Arrays.toString(copiaMatriz));
    }
}