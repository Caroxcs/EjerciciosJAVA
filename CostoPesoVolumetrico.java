import java.util.Scanner;

public class CostoPesoVolumetrico {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double pesoReal, largo, ancho, alto, pesoVol, pesoCobrar, costo;

        // ENTRADA DE DATOS
        System.out.println("Ingrese peso real:");
        pesoReal = teclado.nextDouble();
        System.out.println("Ingrese largo, ancho y alto:");
        largo = teclado.nextDouble();
        ancho = teclado.nextDouble();
        alto = teclado.nextDouble();
        teclado.close();

        // CÁLCULO 
        pesoVol = (largo * ancho * alto) / 5000;
        
        if (pesoReal > pesoVol) {
            pesoCobrar = pesoReal;
        } else {
            pesoCobrar = pesoVol;
        }
        
        costo = pesoCobrar * 2.50;

        // SALIDA
        System.out.printf("Peso a cobrar es: %.2f%n", pesoCobrar);
        System.out.printf("Costo del envío es: %.2f%n", costo);
    }
}