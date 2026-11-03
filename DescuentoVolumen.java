
    import java.util.Scanner;  


    public class DescuentoVolumen {
        public static void main(String[] args) {
            // DECLARACION
            Scanner teclado = new Scanner(System.in);
            double monto, base, dcto, total;
            String frec;

            // CUERPO
            System.out.println("Ingrese monto:");
            monto = teclado.nextDouble();
            System.out.println("Frecuente (S/N):");
            frec = teclado.next();
            teclado.close();

            // CALCULO
            if (monto >= 500) base = 15;
            else if (monto >= 300) base = 10;
            else if (monto >= 100) base = 5;
            else base = 0;
            
            if (frec.equalsIgnoreCase("S")) dcto = base + 5;
            else dcto = base;
            
            total = monto - (monto * dcto / 100.0);
            
            // RESULTADO
            System.out.println("Total a pagar: " + total);
    }
} 