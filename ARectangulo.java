import java.util.Scanner;

public class ARectangulo {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double largo, ancho, area, perimetro;

        // CUERPO
        System.out.println("Ingrese el largo");
        largo = teclado.nextDouble();
        System.out.println("Ingrese el ancho");
        ancho = teclado.nextDouble();
        teclado.close();

        // CALCULO
        area = largo * ancho;
        perimetro = 2 * (largo + ancho);

        // RESULTADO
        System.out.printf("El area es: " + area);
        System.out.printf("El perimetro es: " + perimetro);
    }
}