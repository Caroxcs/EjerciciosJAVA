import java.util.Scanner;

public class AccesoLaboratorio {
    public static void main(String[] args) {
        // DECLARACIONES
        Scanner teclado = new Scanner(System.in);
        String esEstudiante, tieneCarne, tieneAutorizacion, resultado;
        
        // ENTRADA DE DATOS
        System.out.println("Es estudiante? (si/no):");
        esEstudiante = teclado.nextLine();
        
        // CÁLCULO
        resultado = "";
        
        if (esEstudiante.equals("si")) {
            System.out.println("Tiene carné vigente? (si/no):");
            tieneCarne = teclado.nextLine();
            
            // Evaluamos la respuesta del carné
            if (tieneCarne.equals("si")) {
                resultado = "Acceso permitido";
            } else {
                resultado = "Acceso denegado (Carné no vigente)";
            }
            
        } else {
            System.out.println("Tiene autorización especial? (si/no):");
            tieneAutorizacion = teclado.nextLine();
            
            // Evaluamos la autorización
            if (tieneAutorizacion.equals("si")) {
                resultado = "Ingreso temporal";
            } else {
                resultado = "Acceso denegado";
            }
        }
        
        teclado.close();
        
        // SALIDA
        System.out.println("Resultado: " + resultado);
    }
}