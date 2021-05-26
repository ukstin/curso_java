import java.util.Scanner;

public class Uri1060 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float num;
        int aux = 0;

        for (int i = 1; i <= 6; i++) {
            num = teclado.nextFloat();
            if ( num > 0 ) {
                aux++;
            }
        }
        System.out.println(aux + " valores positivos");
    }
}