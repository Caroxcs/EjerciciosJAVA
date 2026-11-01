import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, promedio;

        // CUERPO
        System.out.println("Ingrese la primera nota");
        n1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda nota");
        n2 = teclado.nextDouble();
        System.out.println("Ingrese la tercera nota");
        n3 = teclado.nextDouble();
        teclado.close();

        // CALCULO
        promedio = (n1 + n2 + n3) / 3;

        // RESULTADO
        System.out.printf("El promedio es: %.3f%n", promedio);
    }
}