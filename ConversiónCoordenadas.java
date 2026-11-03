import java.util.Scanner;

public class ConversiónCoordenadas {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        double r, theta, rad, x, y;

        // CUERPO
        System.out.println("Ingrese radio y angulo en grados:");
        r = teclado.nextDouble();
        theta = teclado.nextDouble();
        teclado.close();

        // CALCULO
        rad = Math.toRadians(theta);
        x = r * Math.cos(rad);
        y = r * Math.sin(rad);

        // RESULTADO
        System.out.println("X: " + x + ", Y: " + y);
    }
}
