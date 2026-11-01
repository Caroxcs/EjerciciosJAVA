import java.util.Scanner;

public class BonoProductividad {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double sueldo, productividad, porcentaje, bono, total;

        // CUERPO
        System.out.println("Ingresar el sueldo base");
        sueldo = teclado.nextDouble();
        System.out.println("Productividad");
        productividad = teclado.nextDouble();
        teclado.close();

        if (productividad >= 90) {
            porcentaje = 20;
        } else {
            if (productividad >= 70) {
                porcentaje = 10;
            } else {
                if (productividad >= 50) {
                    porcentaje = 5;
                } else {
                    porcentaje = 0;
                }
            }
        }

        // CALCULO
        bono = sueldo * porcentaje / 100;
        total = sueldo + bono;

        // RESULTADO
        System.out.printf("Bono: %.2f%n", bono);
        System.out.printf("Total a pagar: %.2f%n", total);
    }
}