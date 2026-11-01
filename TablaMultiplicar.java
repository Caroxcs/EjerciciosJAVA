import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int k, i;

        // CUERPO
        System.out.println("Ingrese el numero K:");
        k = teclado.nextInt();
        teclado.close();

        i = 1;
        while (i <= 10) {
            System.out.println(k + " x " + i + " = " + (k * i));
            i = i + 1; 
        }
    }
}