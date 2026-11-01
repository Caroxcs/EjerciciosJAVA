import java.util.Scanner;

public class AprobadosReprobados {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int n, i, aprobados, reprobados;
        double nota;

        // CUERPO
        aprobados = 0;
        reprobados = 0;
        System.out.println("Cantidad de estudiantes:");
        n = teclado.nextInt();
        i = 1;
        while (i <= n) {
            System.out.println("Nota del estudiante " + i + ":");
            nota = teclado.nextDouble();
            if (nota >= 7) {
                aprobados = aprobados + 1;
            } else {
                reprobados = reprobados + 1;
            }
            i = i + 1;
        }
        teclado.close();

        // RESULTADO
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }
}