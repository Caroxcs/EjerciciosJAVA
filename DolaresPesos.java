import java.util.Scanner;

public class DolaresPesos {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double dolares, tipoCambio, pesos;

        // CUERPO
        tipoCambio = 18.49;
        System.out.println("Ingrese la cantidad de dolares");
        dolares = teclado.nextDouble();
        teclado.close();

        // CALCULO
        pesos = dolares * tipoCambio;

        // RESULTADO
        System.out.printf("Equivale a %.2f%n " + pesos + " pesos mexicanos");
    }
}