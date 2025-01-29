/** @author Javier Gil Galan */

public class Utilidades {
    public static boolean validarEntrada(String entrada, String regex) {
        return entrada.matches(regex);
    }

    public static String formatearTexto(String texto) {
        return texto.trim().replaceAll("\\s+", " ");
    }

    public static boolean esNumeroValido(String numero) {
        return numero.matches("\\d+");
    }
} 
