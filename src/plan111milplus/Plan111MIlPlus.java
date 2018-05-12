/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan111milplus;

import plan111milplus.utils.Utils;

/**
 *
 * @author Facundo Martin Gordillo <famargor@ar.ibm.com>
 */
public class Plan111MIlPlus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Utils.mostrarEnConsola(Utils.separator);
        Utils.mostrarEnConsola("¡Bienvenido a los ejercicios resueltos"
                + "de Plan111Mil Plus!");
        Utils.mostrarEnConsola(Utils.separator);
        Utils.mostrarEnConsola("Seleccione la clase en la que está interesad@");
        Utils.mostrarEnConsola(Utils.separator);
        Utils.mostrarEnConsola("1) Introducción\n"
                + "2) Selección\n"
                + "3) Iteración\n"
                + "4) Modulación y funciones\n"
                + "5) Legibilidad y arreglos\n"
                + "PRÓXIMAMENTE EL RESTO");
        Utils.mostrarEnConsola(Utils.separator);

        int decision = Utils.obtenerEntero();

        switch (decision) {
            case 1:
                new Clase1();
            case 2:
                new Clase2();
            case 3:
            case 4:
            case 5:
            default: {
                Utils.mostrarEnConsola(Utils.separator);
                Utils.mostrarEnConsola("¡Muchas gracias por ejecutarme :)!");
            }
        }
    }
}
