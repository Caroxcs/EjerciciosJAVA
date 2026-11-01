import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double km, base, total;
        String noche;

        // CUERPO
        System.out.println("Ingrese los kilometros");
        km = teclado.nextDouble();
        System.out.println("Esta de noche? (s/n)");
        noche = teclado.next();
        teclado.close();

        // CALCULO
        base = 2.00 + 1.50 * km;
        total = base;
        if (km > 10) {
            total = total + base * 0.20;
        }
        if (noche.equals("s")) {
            total = total + base * 0.30;
        }

        // RESULTADO
        System.out.printf("Tarifa base: %.2f%n", base);
        System.out.printf("Total a pagar: %.2f%n", total);
    }
}