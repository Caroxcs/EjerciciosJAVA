import java.util.Scanner;

public class TrianguloAngulos {
    public static void main(String[] args) {
        // DEFINICIONES
        Scanner teclado = new Scanner(System.in);
        double a, b, c, mayor;

        System.out.println("Angulo 1:");
        a = teclado.nextDouble();
        System.out.println("Angulo 2:");
        b = teclado.nextDouble();
        System.out.println("Angulo 3:");
        c = teclado.nextDouble();
        teclado.close();

        // CUERPO
        if (a <= 0 || b <= 0 || c <= 0 || a + b + c != 180) {
            System.out.println("No forman un triangulo");
        } else {
            mayor = a;
            if (b > mayor) {
                mayor = b;
            }
            if (c > mayor) {
                mayor = c;
            }
            if (mayor < 90) {
                System.out.println("Acutangulo");
            } else {
                if (mayor == 90) {
                    System.out.println("Rectangulo");
                } else {
                    System.out.println("Obtusangulo");
                }
            }
        }
    }
}