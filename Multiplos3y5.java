    import java.util.Scanner;

    public class Multiplos3y5 {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        int n, i, cont, suma;

        // CUERPO
        cont = 0;
        suma = 0;
        System.out.println("Ingrese N:");
        n = teclado.nextInt();
        teclado.close();

        // CALCULO
        i = 1;
        while (i <= n) {
            if (i % 3 == 0 || i % 5 == 0) {
                cont = cont + 1;
                suma = suma + i;
            }
            i = i + 1;
        }
        
        // RESULTADO
        System.out.println("Cantidad: " + cont + " Suma: " + suma);
    }
}
