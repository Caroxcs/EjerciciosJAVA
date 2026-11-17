import java.util.Scanner;

public class ClasificacionNotas {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        String letra;
        
        // ENTRADA DE DATOS
        System.out.println("Ingrese la letra (A, B, C, D, F):");
        letra = teclado.nextLine().toUpperCase();
        teclado.close();
        
        // SALIDA / SWITCH
        switch (letra) {
            case "A": System.out.println("Rango: 9.0 - 10.0"); break;
            case "B": System.out.println("Rango: 8.0 - 8.9"); break;
            case "C": System.out.println("Rango: 7.0 - 7.9"); break;
            case "D": System.out.println("Rango: 6.0 - 6.9"); break;
            case "F": System.out.println("Rango: 0.0 - 5.9"); break;
            default: System.out.println("Letra no válida."); break;
        }
    }
}