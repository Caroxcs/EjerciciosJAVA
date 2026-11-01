import java.util.Scanner;

public class NumerosPerfectos {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        int N, i, suma;

        // CUERPO
        System.out.println("N:");
        N = teclado.nextInt();
        teclado.close();

        suma = 0;
        for (i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                suma = suma + i;
            }
        }

        // RESULTADO
        if (N > 1 && suma == N) {
            System.out.println(N + " es perfecto");
        } else {
            System.out.println(N + " no es perfecto");
        }
    }
}