import java.util.Scanner;

public class ClasificacionRendimientoAsistencia {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        double prom, asis;
        String cat;

        // CUERPO
        System.out.println("Ingrese promedio y asistencia:");
        prom = teclado.nextDouble();
        asis = teclado.nextDouble();
        teclado.close();

        // CALCULO
        if (prom >= 9 && asis >= 90) {
            cat = "Excelente";
        } else if (prom >= 7 && asis >= 80) {
            cat = "Bueno";
        } else if (prom >= 6 && asis >= 70) {
            cat = "Regular";
        } else {
            cat = "Deficiente";
        }

        // RESULTADO
        System.out.println("Categoria: " + cat);
    }
}