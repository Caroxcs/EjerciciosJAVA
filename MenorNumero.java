import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int a, b, c, menor;

        // CUERPO
        System.out.println("Ingrese los tres numeros");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        teclado.close();

        if (a <= b && a <= c) {
            menor = a;
        } else {
            if (b <= c) {
                menor = b;
            } else {
                menor = c;
            }
        }

        // RESULTADO
        System.out.println("El menor de los tres es: " + menor);
    }
}