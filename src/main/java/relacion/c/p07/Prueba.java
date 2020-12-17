package relacion.c.p07;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */

public class Prueba {
    
    public static void main(String[] args) {
    //(String nifCliente, String nombreCliente,double saldoCuenta, double interes)
    
        CuentaBancaria a = new CuentaBancaria();
        CuentaBancaria b = new CuentaBancaria();
        CuentaBancaria c = new CuentaBancaria();
        
        CuentaBancaria d = new CuentaBancaria("78988695W", "Alberto López Puertas", 351416.654, 0.0025);
        
        System.out.println(d.toString());
        d.ingresarInteres();
        System.out.println(d.toString());
        d.ingresarDinero(254.684);
        System.out.println(d.toString());
        d.retirarEfectivo(84784181468.54);
        System.out.println(d.toString());
        
        
    }
}
