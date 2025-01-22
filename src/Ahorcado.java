import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        System.out.println("Juego del Ahorcado");

        // Solicitar la palabra secreta
        String palabraAdivinar = solicitarPalabra();
        String cadenaBarras = cadenaBarras(palabraAdivinar);

        Scanner sc = new Scanner(System.in);
        boolean acerto = false;
        int intentos = 0;

        do {
            System.out.println("La palabra que tienes que adivinar es: " + cadenaBarras);
            System.out.println("Jugador 2: introduce una letra o la palabra completa:");
            String letraOpalabra = sc.nextLine().toLowerCase().trim();

            if (letraOpalabra.length() > 1) { // Comprobación de palabra completa
                if (letraOpalabra.equals(palabraAdivinar)) {
                    acerto = true;
                } else {
                    System.out.println("La palabra no es correcta.");
                }
            } else { // Comprobación de una letra
                cadenaBarras = comprobarLetrasEnPalabra(cadenaBarras, palabraAdivinar, letraOpalabra);
                if (cadenaBarras.replace(" ", "").equals(palabraAdivinar)) {
                    acerto = true;
                }
            }
            intentos++;
        } while (!acerto && intentos < 7);

        if (acerto) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraAdivinar);
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + palabraAdivinar);
        }
    }

    public static String comprobarLetrasEnPalabra(String cadenaBarras, String palabraAdivinar, String letra) {
        StringBuilder resultado = new StringBuilder(cadenaBarras);

        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letra.charAt(0)) {
                resultado.setCharAt(i * 2, letra.charAt(0)); // Posición en cadena con espacios
            }
        }

        return resultado.toString();
    }

    public static String solicitarPalabra() {
        Scanner sc = new Scanner(System.in);
        String palabra;

        do {
            System.out.println("Jugador 1: Escribe la palabra secreta:");
            palabra = sc.nextLine().trim();
        } while (palabra.isEmpty());

        palabra = palabra.replace(" ", "").toLowerCase();
        return palabra;
    }

    public static String cadenaBarras(String palabraAdivinar) {
        StringBuilder barras = new StringBuilder();
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            barras.append("_ ");
        }
        return barras.toString();
    }
}
