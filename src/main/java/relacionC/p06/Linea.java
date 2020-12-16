package relacionC.p06;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Linea {

    private PuntoGeometrico puntoA, puntoB;

    public Linea() {
        this.puntoA = new PuntoGeometrico();
        this.puntoB = new PuntoGeometrico(1, 1);
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public void mueveDerecha(double x) {
        this.puntoA.setX(this.puntoA.getX() + x);
        this.puntoB.setX(this.puntoB.getX() + x);
    }

    public void mueveIzquierda(double x) {
        this.puntoA.setX(this.puntoA.getX() - x);
        this.puntoB.setX(this.puntoB.getX() - x);
    }

    public void mueveArriba(double x) {
        this.puntoA.setY(this.puntoA.getY() + x);
        this.puntoB.setY(this.puntoB.getY() + x);
    }

    public void mueveAbajo(double x) {
        this.puntoA.setY(this.puntoA.getY() - x);
        this.puntoB.setY(this.puntoB.getY() - x);
    }

    public void mostrarLinea() {
        System.out.println("[" + this.puntoA.toString() + "," + this.puntoB.toString() + "]");
    }
}
