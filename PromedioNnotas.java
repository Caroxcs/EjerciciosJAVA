import java.util.Scanner;

public class PromedioNnotas {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        int n, i;
        double nota, suma, promedio;

        // CUERPO
        suma = 0;
        System.out.println("Total de notas que va a ingresar");
        n = teclado.nextInt();
        i = 1;
        while (i <= n) {
            System.out.println("Nota " + i + ":");
            nota = teclado.nextDouble();
            suma = suma + nota;
            i = i + 1;
        }
        teclado.close();

        // CALCULO
        promedio = suma / n;

        // RESULTADO
        System.out.printf("El promedio es: %.2f%n", promedio);
    }
}