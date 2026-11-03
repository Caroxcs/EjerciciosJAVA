import java.util.Scanner;

public class TarifaEstacionamiento {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        double horas, tarifa;
        String noct;

        // CUERPO
        System.out.println("Ingrese horas:");
        horas = teclado.nextDouble();
        System.out.println("¿Nocturno? (S/N):");
        noct = teclado.next();
        teclado.close();
        
        // CALCULO
        tarifa = horas * 1.50;
        if (horas > 8) {
            tarifa = tarifa * 1.25;
        }
        if (noct.equalsIgnoreCase("S")) {
            tarifa = tarifa * 1.30;
        }

        // RESULTADO
        System.out.println("Total a pagar: " + tarifa);
    }
}