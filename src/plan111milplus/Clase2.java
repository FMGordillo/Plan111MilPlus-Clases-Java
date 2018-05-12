package plan111milplus;

import plan111milplus.utils.Utils;

/**
 *
 * @author Facundo Martin Gordillo <famargor@ar.ibm.com>
 */
public class Clase2 {

    public Clase2() {
        ejecutarClase();
    }

    /**
     * Clase principal de Clase2
     */
    private void ejecutarClase() {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
    }

    /**
     * Desarrolle un algoritmo que dados tres números determine cuál es el mayor
     * de los tres
     */
    private void ejercicio1() {
        Utils.mostrarEnConsola("a) Mayor de tres");
        Utils.mostrarEnConsola("Ingrese los tres números enteros a comparar");
        int a = Utils.obtenerEntero();
        int b = Utils.obtenerEntero();
        int c = Utils.obtenerEntero();

        // TODO: ¿Hay alguna manera de mejorar esto?
        if (Integer.compare(a, b) >= 0) {
            if (Integer.compare(a, c) >= 0) {
                Utils.mostrarEnConsolaConFormato("El mayor es %d\n", a);
            } else {
                Utils.mostrarEnConsolaConFormato("El mayor es %d\n", c);
            }
        } else if (Integer.compare(b, c) >= 0) {
            Utils.mostrarEnConsolaConFormato("El mayor es %d\n", b);
        } else {
            Utils.mostrarEnConsolaConFormato("El mayor es %d\n", c);
        }

        Utils.mostrarEnConsola(Utils.separator);
    }

    /**
     * Desarrollar un algoritmo que dado un número, ingresado por el usuario
     * determine si el número es par o impar y le informe al usuario En el caso
     * de ser 0 (cero) el algoritmo deberá informarlo
     */
    private void ejercicio2() {
        Utils.mostrarEnConsola("b) Par/Impar");
        Utils.mostrarEnConsola("Ingres un número entero");
        int a = Utils.obtenerEntero();
        if ((a % 2) == 0) {
            Utils.mostrarEnConsolaConFormato("El número %d es par\n", a);
        } else {
            Utils.mostrarEnConsolaConFormato("El número %d es impar\n", a);
        }

        Utils.mostrarEnConsola(Utils.separator);
    }

    /**
     * Una tienda al cumplir años en Octubre ofrece un descuento del 15% a sus
     * clientes en todas sus compras Desarrolle un algoritmo que dada una
     * compra: precio unitario y cantidad el mes indicados por el usuario,
     * determine si el cliente tiene descuento o no
     */
    private void ejercicio3() {
        Utils.mostrarEnConsola("c) Descuento Octubre");
        Double descuento = 15.00;
        Utils.mostrarEnConsola("Ingrese el precio unitario del producto");
        Double precio = Utils.obtenerDoble();
        Utils.mostrarEnConsola("Ingrese la cantidad de productos");
        int cantidad = Utils.obtenerEntero();
        Double precioTotal = precio * cantidad;
        Utils.mostrarEnConsola("Ingrese el mes [1-12]");
        int mes = Utils.obtenerEntero();

        if (mes < 1 || mes > 12) {
            Utils.mostrarEnConsola("Has introducido un mes inválido. "
                    + "Vuelta a intentarlo.\n");
            ejercicio3(); // Más información en la clase "Recursividad"
        } else {
            if (mes == 10) { // Octubre
                Utils.mostrarEnConsolaConFormato("¡Tenés un descuento!\n"
                        + "El nuevo valor es: %f\n", precioTotal
                        - ((precioTotal * descuento) / 100));
            } else {
                Utils.mostrarEnConsola("No tenés descuento :( "
                        + "el precio se mantiene\n");
            }
        }

        Utils.mostrarEnConsola(Utils.separator);
    }

    /**
     * Una empresa desea premiar a sus empleados con un aumento de sueldo
     * Desarrolle un algoritmo dado el salario actual de un empleado determine
     * el aumento de sueldo a aplicar y se lo muestre
     */
    private void ejercicio4() {
        String mensaje = "Al empleado le corresponde un sueldo de %f\n";
        Utils.mostrarEnConsola("d) Aumento de Sueldo");
        Utils.mostrarEnConsola("Ingrese el sueldo actual del empleado");
        Double sueldo = Utils.obtenerDoble();

        /**
         * Un if-then-else puede pevaluar expresiones basadas en un rango de
         * posibles valores o condiciones, mientras que en un switch se evalúa
         * varias expresiones basadas en un sólo valor
         *
         * A veces, no puede simplificarse el código de if-then-else -> switch
         *
         * Hay otras alternativas que veremos más adelante
         */
        if (sueldo <= 15000) {
            Utils.mostrarEnConsolaConFormato(mensaje, sueldo + ((sueldo * 20) / 100));
        }

        if (sueldo > 15000 && sueldo <= 20000) {
            Utils.mostrarEnConsolaConFormato(mensaje, sueldo + ((sueldo * 10) / 100));
        }

        if (sueldo > 20000 && sueldo <= 25000) {
            Utils.mostrarEnConsolaConFormato(mensaje, sueldo + ((sueldo * 5) / 100));
        }

        if (sueldo > 25000) {
            Utils.mostrarEnConsola("No le corresponde aumento al usuario :C");
        }
        
        Utils.mostrarEnConsola(Utils.separator);
    }
}
