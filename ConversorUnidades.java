import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double valor = 0.0, resultado = 0.0;
        
        // ENTRADA DE DATOS
        System.out.println("1. Km a m\n2. M a cm\n3. Horas a min");
        System.out.println("Seleccione una opción:");
        opcion = teclado.nextInt();
        if (opcion >= 1 && opcion <= 3) {
            System.out.println("Ingrese el valor:");
            valor = teclado.nextDouble();
        }
        teclado.close();
        
        // CÁLCULO Y SALIDA
        switch (opcion) {
            case 1: resultado = valor * 1000; System.out.println("Resultado: " + resultado + " metros"); break;
            case 2: resultado = valor * 100; System.out.println("Resultado: " + resultado + " centímetros"); break;
            case 3: resultado = valor * 60; System.out.println("Resultado: " + resultado + " minutos"); break;
            default: System.out.println("Opción inválida."); break;
        }
    }
}