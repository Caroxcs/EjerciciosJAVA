import java.util.Scanner;

public class BonoEmpresa {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int antiguedad;
        double sueldo, porcentajeBono, bono, sueldoTotal;
        String evaluacionExcelente;
        
        // ENTRADA DE DATOS
        System.out.println("Ingrese los años de antigüedad:");
        antiguedad = teclado.nextInt();
        System.out.println("Ingrese el sueldo:");
        sueldo = teclado.nextDouble();
        teclado.nextLine(); // Limpiar buffer
        System.out.println("La evaluación es excelente? (si/no):");
        evaluacionExcelente = teclado.nextLine().toLowerCase();
        teclado.close();
        
        // CÁLCULO
        porcentajeBono = 0.0;
        if (antiguedad > 2) {
            if (evaluacionExcelente.equals("si")) {
                porcentajeBono = 0.15;
            } else {
                porcentajeBono = 0.10;
            }
        } else {
            if (evaluacionExcelente.equals("si")) {
                porcentajeBono = 0.05;
            } else {
                porcentajeBono = 0.0;
            }
        }
        
        bono = sueldo * porcentajeBono;
        sueldoTotal = sueldo + bono;
        
        // SALIDA
        System.out.printf("Bono calculado: $%.2f%n", bono);
        System.out.printf("Sueldo total a pagar: $%.2f%n", sueldoTotal);
    }
}