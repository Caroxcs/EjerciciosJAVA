import java.util.Scanner;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int N, i, aprobados, reprobados;
        double nota, suma, mayor, menor;

        // CUERPO
        System.out.println("Cantidad de calificaciones:");
        N = teclado.nextInt();

        if (N <= 0) {
            System.out.println("N debe ser mayor que 0");
        } else {
            suma = 0;
            aprobados = 0;
            reprobados = 0;
            mayor = 0;
            menor = 0;
            i = 1;

            while (i <= N) {
                System.out.println("Nota " + i + ":");
                nota = teclado.nextDouble();
                suma = suma + nota;

                if (i == 1) {
                    mayor = nota;
                    menor = nota;
                } else {
                    if (nota > mayor) {
                        mayor = nota;
                    }
                    if (nota < menor) {
                        menor = nota;
                    }
                }

                if (nota >= 7) {
                    aprobados = aprobados + 1;
                } else {
                    reprobados = reprobados + 1;
                }

                i = i + 1;
            }

            System.out.printf("Promedio: %.2f%n", suma / N);
            System.out.printf("Mayor: %.2f%n", mayor);
            System.out.printf("Menor: %.2f%n", menor);
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Reprobados: " + reprobados);
        }
        teclado.close();
    }
}