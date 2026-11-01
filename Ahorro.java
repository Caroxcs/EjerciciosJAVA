import java.util.Scanner;

public class Ahorro {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double saldo, deposito, tasa;
        int N, mes;

        // CUERPO
        System.out.println("Capital inicial:");
        saldo = teclado.nextDouble();
        System.out.println("Deposito mensual:");
        deposito = teclado.nextDouble();
        System.out.println("Numero de meses:");
        N = teclado.nextInt();
        System.out.println("Tasa mensual (%), por ejemplo 1.5:");
        tasa = teclado.nextDouble();
        teclado.close();

        // CALCULO
        mes = 1;
        while (mes <= N) {
            saldo = saldo + deposito;
            saldo = saldo + saldo * tasa / 100;
            System.out.printf("Mes %d: %.2f%n", mes, saldo);
            mes = mes + 1;
        }
    }
}