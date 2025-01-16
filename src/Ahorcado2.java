import java.util.Scanner;

public class Ahorcado2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = solicitarPalabraSecreta(scanner);
        jugarAhorcado(scanner, palabraSecreta);
        scanner.close();
    }

    // Solicitar palabra secreta al usuario
    public static String solicitarPalabraSecreta(Scanner scanner) {
        String palabraSecreta;
        do {
            System.out.print("Introduce la palabra secreta (sin espacios): ");
            palabraSecreta = scanner.nextLine().trim().replaceAll(" ", "").toLowerCase();
            if (palabraSecreta.isEmpty()) {
                System.out.println("La palabra secreta no puede estar en blanco. Inténtalo de nuevo.");
            }
        } while (palabraSecreta.isEmpty());

        // Limpiar pantalla (simulado con saltos de línea)
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        return palabraSecreta;
    }

    public static void jugarAhorcado(Scanner scanner, String palabraSecreta) {
        char[] palabraAdivinada = inicializarPalabraAdivinada(palabraSecreta);
        int intentosRestantes = 8;
        boolean juegoGanado = false;
        int intentosFallidos = 0;

        System.out.println("\n--- Bienvenido al Juego del Ahorcado ---");

        while (intentosRestantes > 0 && !juegoGanado) {
            System.out.println("\nPalabra actual: " + String.valueOf(palabraAdivinada));
            mostrarAhorcado(intentosFallidos);
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Introduce una letra: ");

            char letra = scanner.nextLine().toLowerCase().charAt(0);

            boolean letraAcertada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && palabraAdivinada[i] == '_') {
                    palabraAdivinada[i] = letra;
                    letraAcertada = true;
                }
            }

            if (!letraAcertada) {
                intentosRestantes--;
                intentosFallidos++;
                System.out.println("Letra incorrecta.");
            } else {
                System.out.println("¡Bien hecho! Has adivinado una letra.");
            }

            juegoGanado = String.valueOf(palabraAdivinada).equals(palabraSecreta);
        }

        mostrarResultado(juegoGanado, palabraSecreta);
    }

    // Inicializar el array para la palabra adivinada
    public static char[] inicializarPalabraAdivinada(String palabraSecreta) {
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        return palabraAdivinada;
    }

    // Mostrar el resultado final del juego
    public static void mostrarResultado(boolean juegoGanado, String palabraSecreta) {
        if (juegoGanado) {
            System.out.println("\n¡Felicidades! Has ganado. La palabra era: " + palabraSecreta);
        } else {
            System.out.println("\nLo siento, has perdido. La palabra era: " + palabraSecreta);
        }
    }

    // Mostrar dibujo del ahorcado según los intentos fallidos
    private static void mostrarAhorcado(int intentosFallidos) {
        String[] estados = {
                "\n\n\n\n\n\n\n-------",
                "\n\n\n\n\n\n   |\n-------",
                "\n   _________\n   |\n   |\n   |\n   |\n   |\n-------",
                "\n   _________\n   |/     |\n   |\n   |\n   |\n   |\n-------",
                "\n   _________\n   |/     |\n   |      o\n   |\n   |\n   |\n-------",
                "\n   _________\n   |/     |\n   |      o\n   |      |\n   |\n   |\n-------",
                "\n   _________\n   |/     |\n   |      o\n   |     /|\\\n   |\n   |\n-------",
                "\n   _________\n   |/     |\n   |      o\n   |     /|\\\n   |     / \\\n   |\n-------"
        };
        System.out.println(estados[intentosFallidos]);
    }
}

