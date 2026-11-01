import java.util.Scanner;

public class PrestamoSimple {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double prestamo, tasa, cuotaMensual, interesTotal;
        int meses;

        // CUERPO
        System.out.println("Ingrese el monto del prestamo");
        prestamo = teclado.nextDouble();
        System.out.println("Ingrese la tasa mensual");
        tasa = teclado.nextDouble();
        System.out.println("Ingrese el numero de meses");
        meses = teclado.nextInt();
        teclado.close();

        // CALCULO
        interesTotal = prestamo * tasa * meses;
        cuotaMensual = (prestamo + interesTotal) / meses;

        // RESULTADO
        System.out.printf("La cuota mensual es de: %.2f%n", cuotaMensual);
        System.out.printf("El interes total es de: %.2f%n", interesTotal);
    }
}