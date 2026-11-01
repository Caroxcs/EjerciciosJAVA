import java.util.Scanner;

public class MaximoDivisor {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int a, b, residuo;

        // CUERPO
        System.out.println("Ingrese el primer numero");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = teclado.nextInt();
        teclado.close();

        // CALCULO
        while (b != 0) {
            residuo = a % b;
            a = b;
            b = residuo;
        }

        // RESULTADO
        System.out.println("El maximo comun divisor es: " + a);
    }
}