import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double monto, descuento, total;

        // CUERPO
        System.out.println("Monto de la compra");
        monto = teclado.nextDouble();
        teclado.close();

        if (monto >= 200) {
            descuento = monto * 0.15;
        } else {
            if (monto >= 100) {
                descuento = monto * 0.10;
            } else {
                descuento = monto * 0.05;
            }
        }

        // CALCULO
        total = monto - descuento;

        // RESULTADO
        System.out.printf("Monto a pagar es: %.2f%n", total);
    }
}