import java.util.Scanner;

public class GastosTransporte {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        int viajes, diaSemana;
        double costo, gastos;

        // CUERPO
        System.out.println("Viajes por dia");
        viajes = teclado.nextInt();
        System.out.println("Costo por viaje");
        costo = teclado.nextDouble();
        System.out.println("Dias de la semana que viaja");
        diaSemana = teclado.nextInt();
        teclado.close();

        // CALCULO
        gastos = viajes * costo * diaSemana;

        // RESULTADO
        System.out.printf("Su gasto semanal es de: %.2f%n", gastos);
    }
}