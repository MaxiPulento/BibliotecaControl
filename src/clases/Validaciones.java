/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gonzalo
 */
public class Validaciones {

    public static boolean esFloat(final String numero) {
        boolean ret = true;
        try {
            Float.parseFloat(numero);
        } catch (Exception e) {
            ret = false;
        }
        return ret;
    }

    public static boolean estaVacio(final String cadena) {
        try {
            if (cadena.isEmpty()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean esInteger(final String numero) {
        boolean ret = true;
        try {
            Integer.parseInt(numero);
        } catch (Exception e) {
            ret = false;
        }
        return ret;
    }

    public static boolean esMayorA50(String cadena) {
        try {
            if (cadena.length() > 50) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean esMayorA100(String cadena) {
        try {
            if (cadena.length() > 100) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean esMayorA255(String cadena) {
        try {
            if (cadena.length() > 255) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean esEmail(String email) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esTelefono(String telefono) {
        Pattern pattern = Pattern.compile("/^(\\+?56)?(\\s?)(0?9)(\\s?)[98765]\\d{7}$/");
        return pattern.matcher(telefono).matches();
    }

    public static boolean esRutValido(String pRut, String pDv) {
        boolean respuesta = false;
        String rut = pRut.trim();
        String posibleVerificador = pDv.trim();
        int cantidad = rut.length();
        int factor = 2;
        int suma = 0;
        String verificador = "";
        for (int i = cantidad; i > 0; i--) {
            if (factor > 7) {
                factor = 2;
            }
            suma += (Integer.parseInt(rut.substring((i - 1), i))) * factor;
            factor++;
        }
        verificador = String.valueOf(11 - suma % 11);
        if (verificador.equals(posibleVerificador)) {
            respuesta = true;
        } else {
            if ((verificador.equals("10")) && (posibleVerificador.toLowerCase().equals("k"))) {
                respuesta = true;
            } else {
                if ((verificador.equals("11") && posibleVerificador.equals("0"))) {
                    respuesta = true;
                } else {
                    respuesta = false;
                }
            }
        }
        return respuesta;
    }

}
