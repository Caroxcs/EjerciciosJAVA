import java.util.Scanner;

public class sumaSerie {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        int n, i;
        double suma;

        // CUERPO
        suma = 0;
        System.out.println("Ingrese N:");
        n = teclado.nextInt();
        teclado.close();
        // CALCULO
        i = 1;
        while (i <= n) {
            suma = suma + (1.0 / i);
            i = i + 1;
        }
        // RESULTADO
        System.out.printf("Suma: %.2f%n", suma);
    }
}