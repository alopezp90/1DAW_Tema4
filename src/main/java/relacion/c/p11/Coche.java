package relacion.c.p11;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Coche {
    
    private Motor motor;
    private Puerta puerta1, puerta2;
    private Rueda rueda1, rueda2, rueda3, rueda4;
    
    public Coche(Motor motor, Puerta puerta, Rueda rueda){
        this.motor = motor;
        this.puerta1 = puerta;
        this.puerta2 = puerta;
        this.rueda1 = rueda;
        this.rueda2 = rueda;
        this.rueda3 = rueda;
        this.rueda4 = rueda;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuerta1() {
        return puerta1;
    }

    public void setPuerta1(Puerta puerta1) {
        this.puerta1 = puerta1;
    }

    public Puerta getPuerta2() {
        return puerta2;
    }

    public void setPuerta2(Puerta puerta2) {
        this.puerta2 = puerta2;
    }

    public Rueda getRueda1() {
        return rueda1;
    }

    public void setRueda1(Rueda rueda1) {
        this.rueda1 = rueda1;
    }

    public Rueda getRueda2() {
        return rueda2;
    }

    public void setRueda2(Rueda rueda2) {
        this.rueda2 = rueda2;
    }

    public Rueda getRueda3() {
        return rueda3;
    }

    public void setRueda3(Rueda rueda3) {
        this.rueda3 = rueda3;
    }

    public Rueda getRueda4() {
        return rueda4;
    }

    public void setRueda4(Rueda rueda4) {
        this.rueda4 = rueda4;
    }


    @Override
    public String toString() {
        return "Coche{" + "\nmotor=" + motor.toString() 
                + "\npuerta1=" + puerta1.toString() 
                + "\npuerta2=" + puerta2.toString() 
                + "\nrueda1=" + rueda1.toString()
                + "\nrueda2=" + rueda2.toString()
                + "\nrueda3=" + rueda3.toString()
                + "\nrueda4=" + rueda4.toString()
                + "\n}";
    }
    
    
}
