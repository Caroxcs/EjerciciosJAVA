import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int dia;
        
        // ENTRADA DE DATOS
        System.out.println("Ingrese un número del 1 al 7:");
        dia = teclado.nextInt();
        teclado.close();
        
        // SALIDA / SWITCH
        switch (dia) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Día de clases");
                break;
            case 6: case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Número inválido. Debe ser del 1 al 7.");
                break;
        }
    }
}