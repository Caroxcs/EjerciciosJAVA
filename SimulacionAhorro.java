import java.util.Scanner;
public class SimulacionAhorro{
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        int n, i;
        double aporte, saldo;

        // CUERPO
        saldo = 0;
        System.out.println("Ingrese meses (N):");
        n = teclado.nextInt();

        // CALCULO
        i = 1;
        while (i <= n) {
            System.out.println("Aporte mes " + i + ":");
            aporte = teclado.nextDouble();
            saldo = saldo + aporte;
            saldo = saldo + (saldo * 0.008);
            i = i + 1;
        }
        teclado.close();
        // RESULTADO
        System.out.printf("Saldo final: %.2f%n ", saldo);
    }
}