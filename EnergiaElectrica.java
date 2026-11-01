import java.util.Scanner;

public class EnergiaElectrica {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        double consumo, costoEnergia, potencia, horas, tarifa;

        // CUERPO
        System.out.println("Ingrese la potencia (W)");
        potencia = teclado.nextDouble();
        System.out.println("Ingrese las horas de uso diario");
        horas = teclado.nextDouble();
        System.out.println("La tarifa por kWh");
        tarifa = teclado.nextDouble();
        teclado.close();

        // CALCULO
        consumo = (potencia / 1000) * horas * 30;
        costoEnergia = consumo * tarifa;

        // RESULTADO
        System.out.printf("Consumo mensual es de: %.2f kWh%n", consumo);
        System.out.printf("El costo total es de: %.2f%n", costoEnergia);
    }
}