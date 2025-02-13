import java.util.Scanner;


public class Boletin8_2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Ejercicio1();
        System.out.println("Ejercicio 2");
        Ejercicio2();
        System.out.println("Ejercicio 5");
        Ejercicio5();
        System.out.println("Ejercicio 6");
        Ejercicio6();
        System.out.println("Ejercicio 7");
        Ejercicio7();
        System.out.println("Ejercicio 9");
        Ejercicio9();
        System.out.println("Ejercicio 10");
        Ejercicio10();
        System.out.println("Ejercicio 11");
        Ejercicio11();
        System.out.println("Ejercicio 12");
        Ejercicio12();
    }


    public static void Ejercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una contraseña con los siguientes requisitos: "
                + "\n 1- Mínimo 8 caracteres"
                + "\n 2- Como mínimo 1 mayúscula"
                + "\n 3- Como mínimo 1 minúscula"
                + "\n 4- Como mínimo un número");


        String contraseña = scanner.nextLine();


        boolean primeraValidacion = validarLongitud(contraseña);
        boolean segundaValidacion = validarMayusculas(contraseña);
        boolean terceraValidacion = validarMinusculas(contraseña);
        boolean cuartaValidacion = validarNumeros(contraseña);


        if (primeraValidacion == true && segundaValidacion == true && terceraValidacion == true && cuartaValidacion == true) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña no válida, introduce una contraseña valida");
            Ejercicio10();
        }
    }


    public static boolean validarLongitud(String contraseña) {
        return contraseña.length() >= 8;
    }


    public static boolean validarMayusculas(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }


    public static boolean validarMinusculas(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isLowerCase(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }


    public static boolean validarNumeros(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }


    public static void Ejercicio11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el apellido:");
        String apellido = scanner.nextLine();


        String nomFormateado = formatear(nombre, apellido);
        System.out.println("Nombre formateado: " + nomFormateado);
    }


    public static String formatear(String nombre, String apellido) {
        nombre = primeraMayuscula(nombre.replace(" ", ""));
        apellido = primeraMayuscula(apellido.replace(" ", ""));
        return nombre + " " + apellido;
    }


    public static String primeraMayuscula(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }


    public static void Ejercicio12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto que quieras analizar: ");
        String texto = scanner.nextLine();


        int numeroDePalabras = contarPalabras(texto);
        int numeroDeCaracteres = contarCaracteres(texto);
        String palabraMasLarga = encontrarPalabraLarga(texto);


        System.out.println("El número de palabras es: " + numeroDePalabras);
        System.out.println("El numero de caracteres es: " + numeroDeCaracteres);
        System.out.println("La palabra más larga es: " + palabraMasLarga);


    }


    public static int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }


    public static int contarCaracteres(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        return texto.length();
    }


    public static String encontrarPalabraLarga(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        int contador = palabras.length;
        String palabralarga = "";
        for (int i = 0; i < contador; i++) {
            if (palabras[i].length() > palabralarga.length()) {
                palabralarga = palabras[i];
            }
        }
        return palabralarga;
    }


    public static void Ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto:");
        String cadena1 = scanner.nextLine();
        System.out.println("Las dos primeras letras son:");
        ImprimirDousPrimeiros(cadena1);
        System.out.println("Las tres ultimas letras son:");
        ImprimirTresUltimos(cadena1);
        System.out.println("Las letras impares de la palabra son:");
        ImprimirCadaDous(cadena1);
        System.out.println("La palabra espejo es:");
        ImprimirEspejo(cadena1);




    }


    public static void ImprimirDousPrimeiros(String cadena1) {
        if (cadena1.length() >= 2) {
            System.out.println(cadena1.substring(0, 2));
        } else {
            System.out.println("La cadena es muy pequeña");
        }
    }


    public static void ImprimirTresUltimos(String cadena1) {
        if (cadena1.length() >= 3) {
            System.out.println(cadena1.substring(cadena1.length() - 3));
        } else {
            System.out.println("La cadena es muy pequeña");
        }
    }


    public static void ImprimirCadaDous(String cadena1) {
        if (cadena1.length() >= 2) {
            for (int i = 0; i < cadena1.length(); i += 2) {
                System.out.print(cadena1.charAt(i));
            }
            System.out.println();
        } else {
            System.out.println("La cadena es muy pequeña");
        }
    }


    public static void ImprimirEspejo(String cadena1) {
        String espejo = new StringBuilder(cadena1).reverse().toString();
        System.out.println(cadena1 + espejo);
    }


    public static void Ejercicio2() {
        Scanner scanner = new Scanner(System.in);




        System.out.println("Escribe una cadena de texto para separarla por comas:");
        String cadena2 = scanner.nextLine();
        System.out.println("Muestra la cadena separada por comas:");
        System.out.println(insertarEntreLetras(cadena2, ','));


        System.out.println("Escribe una frase para cambiar los espacios en blanco por _:");
        String cadena2_2 = scanner.nextLine();
        System.out.println("Muestra _ en los espacios en blanco:");
        System.out.println(reemplazarEspacios(cadena2_2, '_'));


        System.out.println("Escribe una contraseña segura(numérica):");
        String cadena2_3 = scanner.nextLine();
        System.out.println("Muestra * en los dígitos:");
        System.out.println(reemplazarDigitos(cadena2_3, '*'));
    }


    public static String insertarEntreLetras(String cadena2, char caracter) {
        StringBuilder resultado = new StringBuilder();


        for (int i = 0; i < cadena2.length(); i++) {
            resultado.append(cadena2.charAt(i));


            if (i < cadena2.length() - 1) {
                resultado.append(caracter);
            }
        }


        return resultado.toString(); // Retorna el resultado final
    }


    public static String reemplazarEspacios(String cadena2_2, char caracter) {
        return cadena2_2.replace(' ', caracter); // Retorna la cadena con los espacios reemplazados
    }


    public static String reemplazarDigitos(String cadena2_3, char caracter) {
        return cadena2_3.replaceAll("[0-9]", String.valueOf(caracter));
    }


    public static void Ejercicio4() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escribe un numero entero para separarlo en miles:");
        String num4 = scanner.nextLine();
        System.out.println("Muestra el numero separado por puntos:");


    }


    /*public static void miles(String num4){
        int contador4=0;
        for (int i =0;i< num4.length();i++){
            contador4++;
            if(contador4==3){


            }
        }
    }*/
    public static void Ejercicio5() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escribe una frase para mostrar sus primeras letras:");
        String frase5 = scanner.nextLine();
        System.out.println("Muestra las primeras letras:");
        PrimerasLetras(frase5);
        System.out.println("Solo si empieza por a");
        LetraA(frase5);


    }


    public static void PrimerasLetras(String frase5) {
        String[] frases = frase5.split(" ");
        String resultado = "";
        for (int i = 0; i < frases.length; i++) {
            resultado += frases[i].charAt(0);
        }
        System.out.println(resultado);
        System.out.println(resultado.toUpperCase());
    }


    public static void LetraA(String frase5) {
        String[] frases = frase5.split(" ");
        String resultado = "";
        for (String palabra : frases) {
            if (palabra.startsWith("A") || palabra.startsWith("a"))
                resultado += palabra + " ";
        }
        System.out.println(resultado);
    }


    public static void Ejercicio6() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escribe una palabra para mostrar las vocales y las consonantes por separado");
        String frase6 = scanner.nextLine();
        System.out.println(SoloConsonantes(frase6));
        System.out.println(SoloVocales(frase6));
        System.out.println("Escribe una frase para saber si es palindromo");
        String frase6_2 = scanner.nextLine();
        System.out.println("Resultado= " + esPalíndromo(frase6_2));




    }


    public static String SoloConsonantes(String frase6) {
        return frase6.toLowerCase().replaceAll("[aeiou]", "");
    }


    public static String SoloVocales(String frase6) {
        return frase6.toLowerCase().replaceAll("[^aeiou]", "");
    }


    public static boolean esPalíndromo(String frase6_2) {
        String cadenaLimpia = frase6_2.toLowerCase().replaceAll("[^a-z]", "");
        String cadenaInvertida = "";
        for (int i = cadenaLimpia.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadenaLimpia.charAt(i);
        }
        return cadenaLimpia.equals(cadenaInvertida);
    }


    public static void Ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe dos palabras para saber si la segunda es una parte de la primera");
        System.out.println("Escriba la primera palabra");
        String palabra7_1 = scanner.nextLine();
        System.out.println("Escriba la segunda palabra");
        String palabra7_2 = scanner.nextLine();
        Subcadenas(palabra7_1, palabra7_2);
        System.out.println("Te compara dos palabras por orden alfabetico");
        System.out.print("Ingrese la primera palabra: ");
        String str1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String str2 = scanner.nextLine();
        String resultado = anteriorAlfabeticamente(str1, str2);
        System.out.println("La palabra anterior en orden alfabético es: " + resultado);




    }


    public static void Subcadenas(String palabra7_1, String palabra7_2) {


        boolean resultadoSubcadenas = palabra7_1.toLowerCase().contains(palabra7_2.toLowerCase());
        System.out.println("¿Se encuentra la cadena < " + palabra7_2 + " > dentro de la palabra < " + palabra7_1 + " >?");
        System.out.println("Resultado= " + resultadoSubcadenas);
        System.out.println(" ");
    }


    public static String anteriorAlfabeticamente(String str1, String str2) {
        return (str1.compareTo(str2) < 0) ? str1 : str2;
    }




    public static void Ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena de caracteres, para pasar todos los caracteres al que quiera:");
        String cadena9_1 = scanner.nextLine();
        System.out.println("Escribe el caracter que quieres que aparezca");
        String carcacter9 = scanner.nextLine();
        System.out.println(nuevaCadena(cadena9_1, carcacter9));
    }


    public static String nuevaCadena(String cadena9_1, String caracter9) {
        return cadena9_1.toLowerCase().replaceAll("[^ ]", caracter9);
    }
}


