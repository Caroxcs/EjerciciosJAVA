import java.util.Scanner;

public class InversionNumero {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        int num, inv, dig;

        // CUERPO
        inv = 0;
        System.out.println("Ingrese numero:");
        num = teclado.nextInt();

        teclado.close();
        // CALCULO
        while (num > 0) {
            dig = num % 10;
            inv = (inv * 10) + dig;
            num = num / 10;
        }

        // RESULTADO
        System.out.println("Invertido: " + inv);
    }
}

