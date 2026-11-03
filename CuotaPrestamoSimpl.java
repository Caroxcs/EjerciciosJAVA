import java.util.Scanner;

public class CuotaPrestamoSimpl {
    public static void main(String[] args) {

        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        double cap, tasa, meses, intTotal, cuota;

        // CUERPO
        System.out.println("Ingrese capital, tasa y meses:");
        cap = teclado.nextDouble();
        tasa = teclado.nextDouble();
        meses = teclado.nextDouble();
        teclado.close();

        // CALCULO
        intTotal = cap * tasa * (meses / 12.0);
        cuota = (cap + intTotal) / meses;

        // RESULTADO
        System.out.println("Interes: " + intTotal);
        System.out.printf("Cuota: %.2f%n", cuota);
    }
}