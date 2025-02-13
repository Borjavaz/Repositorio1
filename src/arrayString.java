import java.util.Scanner;

public class arrayString {
    public static void main(String[] args) {
        // Crear un array de strings con algunos nombres
        String[] nombres = {"Ana", "Carlos", "José", "María", "Pedro", "Lucía", "Felipe"};

        // 1. Imprimir todos los nombres del array
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // 2. Buscar un nombre en el array
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce un nombre para buscar: ");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (String nombre : nombres) {
            if (nombre.equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El nombre " + nombreBuscado + " está en la lista.");
        } else {
            System.out.println("El nombre " + nombreBuscado + " no está en la lista.");
        }

        // 3. Contar cuántos nombres tienen más de 5 caracteres
        int contador = 0;
        for (String nombre : nombres) {
            if (nombre.length() > 5) {
                contador++;
            }
        }
        System.out.println("\nHay " + contador + " nombres con más de 5 caracteres.");
    }
}

