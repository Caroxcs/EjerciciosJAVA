import java.util.Scanner;

public class DescuentoLibreria {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        String estudiante;
        Double monto, montoFinal, descuento;

        System.out.println("es estudiante de la utpl (si/no)");
        estudiante = teclado.nextLine();
        System.out.println("ingrese el monto de la compra:");
        monto = teclado.nextDouble();
        teclado.close();
        

        descuento = 0.00;
        if (estudiante.equals("si")){
            if (monto > 30) {
                descuento = 0.25;
                System.out.println("Descuento aplicado: 25% (Estudiante UTPL con compra > $30)");
            }else {
                descuento = 0.20;
                System.out.println("Descuento aplicado: 20% (Estudiante UTPL con compra <= $30)");
                }
            }else {
                if (monto >50){
                    descuento = 0.10;
                    System.out.println("Descuento aplicado: 10% (No estudiante con compra > $50)");
                }else {
                    descuento = 0.0;
                    System.out.print("sin descuento aplicado");
                }
        
            }
        
            montoFinal = monto - (monto * descuento);
            System.out.println ("el monto final a pagar es:" + montoFinal);

    }
}