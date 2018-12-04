package clases;

import java.util.ArrayList;

public class RegistroDocumento {

    
    static ArrayList<Documento> documentos;
    static ArrayList<Object> listaDocumentos;
            
    public RegistroDocumento() {
        documentos = new ArrayList();
    }

    public static void agregar(Documento documento) {
        documentos.add(documento);
    }
    public static ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public static String[] lista() {
        int n = documentos.size();
        String lista[] = new String[n];
        for (int i = 0; i < n; i++) {
            lista[i] = documentos.get(i).toString();
        }
        return lista;
    }

     public static Documento buscar(String codigo) {
        for (int i = 0; i < documentos.size(); i++) {
            if (codigo.equals(documentos.get(i).getCodigo())) {
                
                return documentos.get(i);  
            }
        }
        return null;
    }

     public static Documento buscarObj(String codigo) {
        for (int i = 0; i < documentos.size(); i++) {
            if (codigo.equals(documentos.get(i).getCodigo())) {
                
                return documentos.get(i);  
            }
        }
        return null;
    }
    public static boolean eliminar(String codigo) {
        for (int i = 0; i < documentos.size(); i++) {
            if (codigo.equals(documentos.get(i).getCodigo())) {
                documentos.remove(i);
                return true;
            }
        }return false; 
    }
}
