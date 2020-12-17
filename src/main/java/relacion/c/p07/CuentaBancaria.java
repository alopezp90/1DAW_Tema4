package relacion.c.p07;

/**
 *
 * @author albertolopez
 */
public class CuentaBancaria {

    private long numeroCuenta; 
    private double interes, saldoCuenta;
    private String nifCliente, nombreCliente;
    private static int contador;

    public CuentaBancaria() {
        contador++;
        this.numeroCuenta = 100000 + contador;
        this.saldoCuenta = 0;
        this.interes = 0;
        this.nifCliente = "";
        this.nombreCliente = "";
    }

    public CuentaBancaria(String nifCliente, String nombreCliente,
            double saldoCuenta, double interes) {
        contador++;
        this.numeroCuenta = 100000 + contador;
        this.saldoCuenta = saldoCuenta;
        this.interes = interes;
        this.nifCliente = nifCliente;
        this.nombreCliente = nombreCliente;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(long saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public void ingresarInteres(){
        this.saldoCuenta += this.interes*this.saldoCuenta;
    }
    
    public void ingresarDinero(double cantidad){
        this.saldoCuenta += cantidad;
    }
    
    public void retirarEfectivo(double cantidad){
        if (this.saldoCuenta >= cantidad){
            this.saldoCuenta -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria:" + "\nnumeroCuenta=" + numeroCuenta + "\ninteres=" 
                + interes + "\nsaldoCuenta=" + saldoCuenta + "\nnifCliente=" 
                + nifCliente + "\nnombreCliente=" + nombreCliente;
    }
    
    
}
