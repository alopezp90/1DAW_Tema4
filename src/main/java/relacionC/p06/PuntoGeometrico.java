package relacionC.p06;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class PuntoGeometrico {

    private double x, y;

    public PuntoGeometrico() {
        this.x = 0;
        this.y = 0;
    }

    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
