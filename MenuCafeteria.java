import java.util.Scanner;

public class MenuCafeteria {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        // ENTRADA DE DATOS
        System.out.println("--- MENÚ CAFETERÍA UTPL ---");
        System.out.println("1. Café ($1.50)\n2. Jugo ($1.20)\n3. Sandwich ($2.50)\n4. Salir");
        System.out.println("Seleccione una opción:");
        opcion = teclado.nextInt();
        teclado.close();
        
        // SALIDA / SWITCH
        switch (opcion) {
            case 1: System.out.println("Producto: Café. Precio: $1.50"); break;
            case 2: System.out.println("Producto: Jugo. Precio: $1.20"); break;
            case 3: System.out.println("Producto: Sandwich. Precio: $2.50"); break;
            case 4: System.out.println("¡Gracias por su visita! Saliendo..."); break;
            default: System.out.println("Opción inválida."); break;
        }
    }
}