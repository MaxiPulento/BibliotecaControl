package clases;

public class Revista extends Documento {

    private int volumen;
    private int numero;
    private int mes;

    public Revista() {
        super();
    }

    public Revista(int volumen, int numero, int mes, String codigo, String titulo, String autor, String editorial, int ano) throws Exception {
        super(codigo, titulo, autor, editorial, ano);
        this.volumen = volumen;
        this.numero = numero;
        this.setMes(mes);
     }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            System.out.println("Mes Valido");
        }else{
            throw new Exception("El mas no es valido");
        }

    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+ " Revista{ volumen=" + volumen + ": numero=" + numero + ":mes=" + mes;
    }

}
