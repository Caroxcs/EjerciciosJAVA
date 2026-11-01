import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int mes, dia, f;

        // CUERPO
        System.out.println("Ingrese el mes");
        mes = teclado.nextInt();
        System.out.println("Ingrese el dia");
        dia = teclado.nextInt();
        teclado.close();

        // CALCULO
        f = mes * 100 + dia;
        if (f >= 1221 || f <= 320) {
            System.out.println("Verano");
        } else {
            if (f <= 620) {
                System.out.println("Otono");
            } else {
                if (f <= 922) {
                    System.out.println("Invierno");
                } else {
                    System.out.println("Primavera");
                }
            }
        }
    }
}