import java.util.Scanner;

public class TransporteLoja {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        // ENTRADA DE DATOS
        System.out.println("1. Bus\n2. Taxi\n3. Bicicleta\n4. Caminar");
        System.out.println("Seleccione opción:");
        opcion = teclado.nextInt();
        teclado.close();
        
        // SALIDA / SWITCH
        switch (opcion) {
            case 1: System.out.println("Bus: 25-35 min. Económico."); break;
            case 2: System.out.println("Taxi: 10-15 min. Rápido y directo."); break;
            case 3: System.out.println("Bicicleta: 20-25 min. Ecológico."); break;
            case 4: System.out.println("Caminar: 60-75 min. Ejercicio saludable."); break;
            default: System.out.println("Opción no válida."); break;
        }
    }
}