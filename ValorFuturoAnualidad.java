import java.util.Scanner;

public class ValorFuturoAnualidad {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double deposito, tasa, meses, vf, totalDepositado;

        // CUERPO
        System.out.println("Ingrese el deposito mensual");
        deposito = teclado.nextDouble();
        System.out.println("Ingrese la tasa de interes mensual");
        tasa = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de meses");
        meses = teclado.nextDouble();
        teclado.close();

        // CALCULO
        totalDepositado = deposito * meses;
        vf = deposito * (Math.pow(1 + tasa, meses) - 1) / tasa;

        // SALIDA
        System.out.printf("El total depositado es: %.2f%n", totalDepositado);
        System.out.printf("El valor futuro de la anualidad es: %.2f%n", vf);

    }
}
