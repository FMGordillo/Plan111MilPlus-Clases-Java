package plan111milplus;

import plan111milplus.utils.Utils;

/**
 *
 * @author Facundo Martin Gordillo <famargor@ar.ibm.com>
 */
public class Clase1 {
    
    public Clase1() {
        ejecutarClase();
    }
    
    /**
     * Clase principal de Clase1
     */
    private void ejecutarClase() {
        ejercicio1();
        ejercicio2();
    }
    
    /**
     * a) Implemente un algoritmo que calcule y muestre por pantalla
     * el precio final de un producto después de aplicarle un descuento.
     */
    private void ejercicio1() {
        Utils.mostrarEnConsola("a) Cálculo de descuento");
        Utils.mostrarEnConsola("* Ingrese precio");
        Double precio = Utils.obtenerDoble();
        Utils.mostrarEnConsola("* Ingrese el descuento a aplicar "
                + "(en porcentaje, sin %)");
        Double descuento = Utils.obtenerDoble();
        Utils.mostrarEnConsolaConFormato("** RESULTADO\n"
                + "** Precio: %f\n"
                + "** Descuento: %f\n"
                + "** Precio final: %f\n",
                precio, descuento, precio - ((precio * descuento) / 100));
        Utils.mostrarEnConsola(Utils.separator);
    }
    
    /**
     * b) En una prueba, un piloto tiene que completar 4 vueltas
     * Se necesita un programa que permita ingresar por teclado el tiempo de
     * cada vuelta
     * El programa debe retornar el tiempo total y el promedio de vuelta.
     */
    private void ejercicio2() {
        Utils.mostrarEnConsola("b) Autos de carrera");
        Utils.mostrarEnConsola("Ingrese el tiempo de cada vuelta");
        Double tiempo = Utils.obtenerDoble();
        Utils.mostrarEnConsolaConFormato("** RESULTADO:\n"
                + "** Tiempo total: %f\n"
                + "** Promedio de cada vuelta: %f\n", tiempo, tiempo * 4);
    }
    
}
