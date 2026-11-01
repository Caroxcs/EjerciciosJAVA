import java.util.Scanner;

public class DecimalHexadecimal {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int num, residuo;
        String hex, digito;

        // CUERPO
        System.out.println("Ingrese un numero decimal entero:");
        num = teclado.nextInt();
        teclado.close();

        if (num == 0) {
            hex = "0";
        } else {
            hex = "";
            while (num > 0) {
                residuo = num % 16;
                if (residuo < 10) {
                    digito = String.valueOf(residuo);
                } else {
                    switch (residuo) {
                        case 10: digito = "A"; break;
                        case 11: digito = "B"; break;
                        case 12: digito = "C"; break;
                        case 13: digito = "D"; break;
                        case 14: digito = "E"; break;
                        default: digito = "F"; break;
                    }
                }
                hex = digito + hex;
                num = num / 16;
            }
        }
        System.out.println("El numero en hexadecimal es: " + hex);
    }
}