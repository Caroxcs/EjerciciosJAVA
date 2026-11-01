import java.util.Scanner;

public class PrecioFinal {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double precio, conDescuento, iva, precioFinal;

        // CUERPO
        System.out.println("Ingrese el precio original");
        precio = teclado.nextDouble();
        teclado.close();

        // CALCULO
        conDescuento = precio * 0.80;
        iva = conDescuento * 0.15;
        precioFinal = conDescuento + iva;

        // RESULTADO
        System.out.printf("Precio con descuento: %.2f%n", conDescuento);
        System.out.printf("Precio final: %.2f%n", precioFinal);
    }
}