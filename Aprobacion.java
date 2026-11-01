import java.util.Scanner;

public class Aprobacion {
    public static void main(String[] args_){
        //DECLARACIONES 
        Scanner teclado = new Scanner(System.in);
        double promedio;

        //CUERPO
        System.out.println("Ingrese el promedio final ");
        promedio = teclado.nextDouble();
        teclado.close();
        
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
