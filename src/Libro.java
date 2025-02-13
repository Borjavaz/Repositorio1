/**
 * Clase que representa a un libro
 */
public class Libro {
    //Propiedades da clase libro
    public String titulo;
    public String autor;
    private int numPaginas;
    private double prezo;
    private int cantidad;

    public Libro(String tit, String aut, int pax, double prez, int cant){
        titulo=tit;
        autor=aut;
        setNumPaginas(pax);
        setPrezo(prez);
        setCantidad(cant);
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAtor(){
        return autor;
    }
    public int getNumPaginas(){
        return numPaginas;
    }
    public double getPrezo(){
        return prezo;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setAutor(String novoAutor){
        autor=novoAutor;
    }
    public void setTitulo(String novoTitulo){
        titulo= novoTitulo;
    }
    public void setNumPaginas(int novaPaxinas){
        if(novaPaxinas>0) numPaginas=novaPaxinas;
        else System.out.println("O numero de paxinas debe ser mayor que");
    }
    public void setPrezo(double novoPrezo){
        if(novoPrezo>0) prezo=novoPrezo;
        else System.out.println("O prezo debe ser maior que cero");
    }
    public void setCantidad(int novaCantidade){
        if(novaCantidade>0) cantidad=novaCantidade;
        else System.out.println("A cantidade non pode ser negativa");
    }
    public boolean venderLibro(int cantidadVenta){
        if(cantidad >= cantidadVenta){
            actualizarCantidad(-cantidadVenta);
            return true;
        }
        else return false;
    }
    private void actualizarCantidad(int cantidadActualizar){
        cantidad=cantidad+cantidadActualizar;
    }
    public void rexistrarEntradaLibro(int cantidadEntrada){
        actualizarCantidad(cantidadEntrada);
    }
}
