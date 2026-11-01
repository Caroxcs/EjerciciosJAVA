import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int numero;

        // CUERPO
        System.out.println("Ingrese un numero entero:");
        numero = teclado.nextInt();
        teclado.close();

        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }
}