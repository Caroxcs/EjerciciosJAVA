import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        String esEstudiante;
        double horas, tarifaBase, tarifaDescontada, montoFinal;
        
        // ENTRADA DE DATOS
        System.out.println("Es estudiante UTPL? (si/no):");
        esEstudiante = teclado.nextLine().toLowerCase();
        System.out.println("Ingrese las horas de permanencia:");
        horas = teclado.nextDouble();
        teclado.close();
        
        // CÁLCULO
        tarifaBase = horas * 1.00;
        if (esEstudiante.equals("si")) {
            tarifaDescontada = tarifaBase * 0.50;
            if (horas > 4) {
                montoFinal = tarifaDescontada * 1.20;
            } else {
                montoFinal = tarifaDescontada;
            }
        } else {
            tarifaDescontada = tarifaBase;
            if (horas > 6) {
                montoFinal = tarifaDescontada * 1.20;
            } else {
                montoFinal = tarifaDescontada;
            }
        }
        
        // SALIDA
        System.out.printf("El monto a pagar es: $%.2f%n", montoFinal);
    }
}