import java.util.Scanner;

public class SumaHastaCero {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int numero, suma = 0;

        // CUERPO
        System.out.print("ingrese un numero");
        numero = teclado.nextInt();
        while (numero != 0) {
            suma = suma + numero;
            System.out.println("Ingrese otro numero (0 para terminar)");
            numero = teclado.nextInt();
        }
        teclado.close();

        // RESULTADO
        System.out.println("La suma total es: " + suma);
    }
}