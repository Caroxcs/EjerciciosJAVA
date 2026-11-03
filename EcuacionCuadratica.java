import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        double a, b, c, disc;
        String msj;

        // CUERPO
        System.out.println("ingrese el valor de a, b y c");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        teclado.close();

        // CALCULO
        disc = (b * b) - (4 * a * c);
        if (disc > 0) {
            msj = "Dos soluciones reales";
        } else if (disc == 0) {
            msj = "Una solucion real";
        } else {
            msj = "Ninguna solucion real";
        }
        
        // RESULTADO
        System.out.println(msj);

    }
}
