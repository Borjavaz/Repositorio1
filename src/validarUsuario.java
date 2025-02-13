import java.util.regex.Pattern;
import java.util.Scanner;

public class validarUsuario {

    public static boolean isValidName(String name) {
        return name.length() >= 2 && name.length() <= 30;
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.endsWith(".com");
    }

    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        return Pattern.matches(passwordRegex, password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese su correo electrónico: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        if (!isValidName(name)) {
            System.out.println("El nombre debe tener entre 2 y 30 caracteres.");
        } else if (!isValidEmail(email)) {
            System.out.println("El correo electrónico debe contener un @ y terminar en .com.");
        } else if (!isValidPassword(password)) {
            System.out.println("La contraseña debe tener al menos una mayúscula, una minúscula y un número.");
        } else {
            System.out.println("Usuario validado correctamente.");
        }

        scanner.close();
    }
}

