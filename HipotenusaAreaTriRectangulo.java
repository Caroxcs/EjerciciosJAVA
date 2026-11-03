import java.util.Scanner;

public class HipotenusaAreaTriRectangulo {
    public static void main(String[] args){
        // DECLARACIONES 
        Scanner teclado = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa, area;

        System.out.println("Ingrese el valor del primer cateto");
        cateto1 = teclado.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto");
        cateto2 = teclado.nextDouble();
        teclado.close();


        // CALCULO
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        area = (cateto1 * cateto2) / 2;

        // SALIDA
        System.out.printf("El valor de la hipotenusa es: %.2f%n", hipotenusa);
        System.out.printf("El valor del area del triangulo rectangulo es: %.2f%n", area);
    }
}
