import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int n, b0, b1, b2, b3, b4, b5, b6, b7;

        // CUERPO
        System.out.println("Ingrese un numero");
        n = teclado.nextInt();
        teclado.close();

        // CALCULO
        b0 = n % 2;  n = n / 2;
        b1 = n % 2;  n = n / 2;
        b2 = n % 2;  n = n / 2;
        b3 = n % 2;  n = n / 2;
        b4 = n % 2;  n = n / 2;
        b5 = n % 2;  n = n / 2;
        b6 = n % 2;  n = n / 2;
        b7 = n % 2;
        
        // RESULTADO
        System.out.println("El numero en binario es: " + b7 + b6 + b5 + b4 + b3 + b2 + b1 + b0);
    }
}