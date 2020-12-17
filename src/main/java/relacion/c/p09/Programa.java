package relacion.c.p09;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Programa {

    public static void main(String[] args) {

        Nif dni = new Nif(Nif.leer());
        dni.mostrar();
    }

}
