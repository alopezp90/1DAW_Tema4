package relacion.c.p09;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import java.util.Scanner;

public class Nif {

    private String numero;
    private char letra;

    public Nif() {
        this.numero = "0";
        this.letra = 'o';
    }

    public Nif(String numero) {
        this.numero = numero;
        this.letra = calculaLetra(numero);
    }

    private char calculaLetra(String numero) {
        char ch;
        switch (Integer.parseInt(numero) % 23) {
            case 0:
                ch = 'T';
                break;
            case 1:
                ch = 'R';
                break;
            case 2:
                ch = 'W';
                break;
            case 3:
                ch = 'A';
                break;
            case 4:
                ch = 'G';
                break;
            case 5:
                ch = 'M';
                break;
            case 6:
                ch = 'Y';
                break;
            case 7:
                ch = 'F';
                break;
            case 8:
                ch = 'P';
                break;
            case 9:
                ch = 'D';
                break;
            case 10:
                ch = 'X';
                break;
            case 11:
                ch = 'B';
                break;
            case 12:
                ch = 'N';
                break;
            case 13:
                ch = 'J';
                break;
            case 14:
                ch = 'Z';
                break;
            case 15:
                ch = 'S';
                break;
            case 16:
                ch = 'Q';
                break;
            case 17:
                ch = 'V';
                break;
            case 18:
                ch = 'H';
                break;
            case 19:
                ch = 'L';
                break;
            case 20:
                ch = 'C';
                break;
            case 21:
                ch = 'K';
                break;
            default:
                ch = 'E';
                break;
        }
        return ch;
    }

    public String getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public static String leer() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for (int i = 0; i < 8 - num.length(); i++) {
            num = "0" + num;
        }
        return num;
    }

    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    public void mostrar() {
        System.out.println(toString());
    }
}
