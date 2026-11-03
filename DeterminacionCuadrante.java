import java.util.Scanner;

public class DeterminacionCuadrante {
    public static void main(String[] args){
        // DECLARACION
        Scanner teclado = new Scanner(System.in);
        double x, y;
        String pos;

        // DECLARACION
        System.out.println("ingrese x , y");
        x = teclado.nextDouble();
        y = teclado.nextDouble();
        teclado.close();

        // CALCULO
        if (x == 0 && y == 0) pos = "Origen";
        else if (x == 0) pos = "Eje Y";
        else if (y == 0) pos = "Eje X";
        else if (x > 0 && y > 0) pos = "Cuadrante I";
        else if (x < 0 && y > 0) pos = "Cuadrante II";
        else if (x < 0 && y < 0) pos = "Cuadrante III";
        else pos = "Cuadrante IV";
        // RESULTADO
        System.out.println(pos);

    }
}
