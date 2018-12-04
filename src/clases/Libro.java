package clases;
public class Libro extends Documento{
    private boolean prestamo;

    public Libro() {
        super();
    }

    public Libro(boolean prestamo, String codigo, String titulo, String autor, String editorial, int año) throws Exception {
        super(codigo, titulo, autor, editorial, año);
        this.prestamo = prestamo;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return super.toString() + " Libro{" + "prestamo=" + prestamo + '}';
    }

    
    
}
