import java.util.Scanner;

public class TemperaturaLoja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temperatura = 0.0;
        String clasificacion = "";
        
        
        System.out.print("Ingrese la temperatura en Loja (°C): ");
        temperatura = teclado.nextDouble();
        teclado.close();


        if (temperatura < 15) {
            clasificacion = "Frío";
        } else if (temperatura <= 25) {
            clasificacion = "Templado";
        } else {
            clasificacion = "Cálido";
            if (temperatura > 30) {

            }
        }
        
        System.out.println("Clasificación: " + clasificacion);

    }
}