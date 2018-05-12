package plan111milplus.utils;

import java.util.Scanner;

/**
 *
 * @author Facundo Martin Gordillo <famargor@ar.ibm.com>
 */
public class Utils {
    
    private static Scanner in = new Scanner(System.in);
    
    public static String separator = "-------------------------";
    
    /**
     * Obtiene el texto ingresado por consola
     * @return String
     */
    public static String obtenerTexto() {
        return in.next();
    }
    /**
     * Obtiene el entero ingresado por consola
     * @return int
     */
    public static int obtenerEntero() {
        return in.nextInt();
    }
    /**
     * Obtiene el double ingresado por consola
     * @return Double
     */
    public static Double obtenerDoble() {
        return in.nextDouble();
    } 
    
    /**
     * Muestra en consola el mensaje (sin formato)
     * @param mensaje 
     */
    public static void mostrarEnConsola(String mensaje) {
        System.out.println(mensaje);
    }
    /**
     * Muestra en consola el mensaje, formato obligatorio
     * @param mensaje 
     * @param formato
     */
    public static void mostrarEnConsolaConFormato(String mensaje, Object ...formato) {
        System.out.printf(mensaje, formato);
    }
}
