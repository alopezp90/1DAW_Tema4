package relacion.c.p06;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Prueba {

    public static void main(String[] args) {

        PuntoGeometrico a = new PuntoGeometrico(3, 4.5);
        PuntoGeometrico b = new PuntoGeometrico(1, 1);

        Linea linea = new Linea(a, b);
        
        linea.mostrarLinea();
        
        linea.mueveArriba(1);
        
        linea.mostrarLinea();
    }
}
