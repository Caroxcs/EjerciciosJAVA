import java.util.Scanner;

public class PuntoMedioDistancia {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia, pMedio_x, pMedio_y;

        // CUERPO
        System.out.println("Ingrese el valor de x1");
        x1 = teclado.nextDouble();
        System.out.println("Ingrese el valor de x2");
        x2 = teclado.nextDouble();
        System.out.println("Ingrese el valor de y1");
        y1 = teclado.nextDouble();
        System.out.println("Ingrese el valor de y2");
        y2 = teclado.nextDouble();
        teclado.close();

        // CALCULO
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        pMedio_x = (x1 + x2) / 2;
        pMedio_y = (y1 + y2) / 2;

        // RESULTADO
        System.out.printf("La distancia entre los dos puntos es: %.2f%n", distancia);
        System.out.printf("El punto medio es: (%.2f, %.2f)%n", pMedio_x, pMedio_y);
    }
}