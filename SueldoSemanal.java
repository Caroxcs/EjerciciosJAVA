import java.util.Scanner;

public class SueldoSemanal {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double horas, tarifa, sueldo;

        // CUERPO
        System.out.println("Horas trabajadas");
        horas = teclado.nextDouble();
        System.out.println("Pago por hora");
        tarifa = teclado.nextDouble();
        teclado.close();

        if (horas <= 40) {
            sueldo = horas * tarifa;
        } else {
            sueldo = (40 * tarifa) + ((horas - 40) * tarifa * 2);
        }

        // RESULTADO
        System.out.printf("Sueldo semanal: %.2f%n", sueldo);
    }
}