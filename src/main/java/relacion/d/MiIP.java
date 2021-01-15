package relacion.d;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class MiIP {

    private Short octeto1, octeto2, octeto3, octeto4;

    /**
     * Constructor por defecto de MiIP. Inicializa:<ul>
     * <li>octeto1: 0.
     * <li>octeto2: 0.
     * <li>octeto3: 0.
     * <li>octeto4: 0.</ul>
     */
    public MiIP() {
        this.octeto1 = 0;
        this.octeto2 = 0;
        this.octeto3 = 0;
        this.octeto4 = 0;
    }

    /**
     * Constructor parametrizado de MiIP
     *
     * @param octeto1 int
     * @param octeto2 int
     * @param octeto3 int
     * @param octeto4 int
     */
    public MiIP(int octeto1, int octeto2, int octeto3, int octeto4) {
        this.octeto1 = checkOcteto(octeto1);
        this.octeto2 = checkOcteto(octeto2);
        this.octeto3 = checkOcteto(octeto3);
        this.octeto4 = checkOcteto(octeto4);
    }

    /**
     * Constructor parametrizado de MiIP
     *
     * @param octeto1 String
     * @param octeto2 String
     * @param octeto3 String
     * @param octeto4 String
     */
    public MiIP(String octeto1, String octeto2, String octeto3, String octeto4) {
        this.octeto1 = checkOcteto(octeto1);
        this.octeto2 = checkOcteto(octeto2);
        this.octeto3 = checkOcteto(octeto3);
        this.octeto4 = checkOcteto(octeto4);
    }

    /**
     * Comprueba que el octeto este en el rango valido
     *
     * @param octeto int introducido
     * @return Short rectificado entre 0 y 255
     */
    private static Short checkOcteto(int octeto) {
        if (octeto < 0 || octeto > 255) {
            return 255;
        } else {
            return (short) octeto;
        }
    }

    /**
     * Comprueba que el octeto este en el rango valido
     *
     * @param octeto String introducido
     * @return Short rectificado entre 0 y 255
     * @throws NumberFormatException
     */
    private static Short checkOcteto(String octeto) {
        Short tmp = Short.parseShort(octeto);
        if (tmp < 0 || tmp > 255) {
            return 255;
        } else {
            return (short) tmp;
        }
    }

    //Metodos Getter
    public Short getOcteto1() {
        return octeto1;
    }

    public Short getOcteto2() {
        return octeto2;
    }

    public Short getOcteto3() {
        return octeto3;
    }

    public Short getOcteto4() {
        return octeto4;
    }

    //Metodos Setter
    public void setOcteto1(int octeto1) {
        this.octeto1 = checkOcteto(octeto1);
    }

    public void setOcteto1(String octeto1) {
        this.octeto1 = checkOcteto(octeto1);
    }

    public void setOcteto2(int octeto2) {
        this.octeto2 = checkOcteto(octeto2);
    }

    public void setOcteto2(String octeto2) {
        this.octeto2 = checkOcteto(octeto2);
    }

    public void setOcteto3(int octeto3) {
        this.octeto3 = checkOcteto(octeto3);
    }

    public void setOcteto3(String octeto3) {
        this.octeto3 = checkOcteto(octeto3);
    }

    public void setOcteto4(int octeto4) {
        this.octeto4 = checkOcteto(octeto4);
    }

    public void setOcteto4(String octeto4) {
        this.octeto4 = checkOcteto(octeto4);
    }

    /**
     *
     * @return String con la representacion binaria del primer octeto.
     */
    public String getOct1Binary() {
        return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int) this.octeto1)));
    }

    /**
     *
     * @return String con la representacion binaria del segundo octeto.
     */
    public String getOct2Binary() {
        return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int) this.octeto2)));
    }

    /**
     *
     * @return String con la representacion binaria del tercer octeto.
     */
    public String getOct3Binary() {
        return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int) this.octeto3)));
    }

    /**
     *
     * @return String con la representacion binaria del cuarto octeto.
     */
    public String getOct4Binary() {
        return String.format("%08d", Integer.parseInt(Integer.toBinaryString((int) this.octeto4)));
    }

    @Override
    public String toString() {
        return octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
    }

    /**
     *
     * @return String con la notacion hexadecimal de MiIP
     */
    public String toStringHex() {
        return Integer.toHexString((int) this.octeto4 + (int) this.octeto3 * 256 + (int) this.octeto2 * 256 * 256 + (int) this.octeto1 * 256 * 256 * 256);
    }

    /**
     *
     * @return String con la notacion binaria de MiIP
     */
    public String toStringBinary() {
        return this.getOct1Binary() + "." + this.getOct2Binary() + "."
                + this.getOct3Binary() + "." + this.getOct4Binary();
    }

    public static void main(String[] args) {
        MiIP ip = new MiIP(192, 168, 103, 250);
        System.out.println(ip.toString());
        System.out.println(ip.toStringHex());
        System.out.println(ip.toStringBinary());

        MiIP ip2 = new MiIP("45", "-20", "250", "450");
        System.out.println(ip2.toString());
        System.out.println(ip2.toStringHex());
        System.out.println(ip2.toStringBinary());
    }

}
