public class Casa_Libro {
    public static void main(String[] args) {
        Libro quijote= new Libro("El Quijote","Cervantes",750,37.75,100);
        quijote.setTitulo("Sesudo estudo sobre o simpatico libro do Quijote");
        quijote.setAutor("Juanjo Millas");

        System.out.println(quijote.getAtor() + " " + quijote.getTitulo());
        if(quijote.venderLibro(5)) System.out.println("Vendido");
        else System.out.println("Error de venta. Hay stock?");
        quijote.rexistrarEntradaLibro(10);
        if(quijote.venderLibro(5))System.out.println("Vendido");
        else System.out.println("Error de venta. Hay stock?");
    }
}
