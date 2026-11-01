import java.util.Scanner;

public class ViajePeajes {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double distancia, consumo, precio_combustible, costo_peaje;
        double litros, costo_combustible, costo_peajes, total;
        int num_peajes;

        // CUERPO
        System.out.println("Distancia:");
        distancia = teclado.nextDouble();
        System.out.println("Consumo:");
        consumo = teclado.nextDouble();
        System.out.println("Precio del combustible por litro:");
        precio_combustible = teclado.nextDouble();
        System.out.println("Numero de peajes:");
        num_peajes = teclado.nextInt();
        System.out.println("Costo unitario del peaje:");
        costo_peaje = teclado.nextDouble();
        teclado.close();

        // CALCULO
        litros = distancia / consumo;
        costo_combustible = litros * precio_combustible;
        costo_peajes = num_peajes * costo_peaje;
        total = costo_combustible + costo_peajes;

        // RESULTADO
        System.out.printf("Litros necesarios: %.2f%n", litros);
        System.out.printf("Costo de combustible: %.2f%n", costo_combustible);
        System.out.printf("Costo de peajes: %.2f%n", costo_peajes);
        System.out.printf("Costo total: %.2f%n", total);
    }
}