package clases;

import java.util.Calendar;
import java.util.Date;

public class Documento {

    private String codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private int año;

    public Documento() {
    }

    public Documento(String codigo, String titulo, String autor, String editorial, int año) throws Exception {
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEditorial(editorial);
        this.setAño(año);

    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) throws Exception {
        Calendar calendario = Calendar.getInstance();
        int anoActual = calendario.get(Calendar.YEAR);
        /*if (año >= 1900) {
            throw new Exception("El año no puede ser menor que 1900.");
        } else if (año <= anoActual) {
            throw new Exception("El año no puede ser mayor al año actual.");
        }*/
        if (año > 1900 && año <= anoActual) {
            this.año = año;
        } else {
            throw new Exception("El año no esta dentro del rango permitido");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        if (!codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            throw new Exception("No puede registar con casillas vacias");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            throw new Exception("No puede registar con casillas vacias");
        }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws Exception {
        if (!autor.isEmpty()) {
            this.autor = autor;
        } else {
            throw new Exception("No puede registar con casillas vacias");
        }

    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) throws Exception {
        if (!editorial.isEmpty()) {
            this.editorial = editorial;
        } else {
            throw new Exception("No puede registar con casillas vacias");
        }

    }

    @Override
    public String toString() {
        return "Documento{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", a\u00f1o=" + año + '}';
    }

}
