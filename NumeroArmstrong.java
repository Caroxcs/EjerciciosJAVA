import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) {
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        int num, temp, suma, digito;
        String resultado;

        // CUERPO
        System.out.println("Ingrese un número de tres dígitos:");
        num = teclado.nextInt();
        teclado.close();

        // CALCULO
        if (num >= 100 && num <= 999) {
            temp = num;
            suma = 0;
            
            while (temp > 0) {
                digito = temp % 10;
                suma += (digito * digito * digito); // También se puede usar Math.pow(digito, 3)
                temp /= 10;
            }
            
            if (suma == num) {
                resultado = "El número " + num + " ES un número de Armstrong.";
            } else {
                resultado = "El número " + num + " NO es un número de Armstrong.";
            }
        } else {
            resultado = "Error: Por favor, ingrese exactamente un número de tres dígitos.";
        }

        // RESULTADO
        System.out.println(resultado);
    }
}