public class IncrementoSalarial {
    public static void main(String[] args) {
        // DECLARACIONES
        double salario;
        int anual;

        // CUERPO
        salario = 1500;
        anual = 1;
        while (anual <= 6) {
            salario = salario * 1.10;
            System.out.printf("Anio %d: $%.2f%n", anual, salario);
            anual = anual + 1;
        }

        // RESULTADO
        System.out.printf("Salario final despues de 6 anios: $%.2f%n", salario);
    }
}