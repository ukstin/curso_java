import java.util.Scanner;

public class Uri1115 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x, y, aux = 1;

        while ( aux != 0 ) {

            x = teclado.nextInt();
            y = teclado.nextInt();

            if ( x * y == 0) {
                break;
            }

            if ( x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
        }
    }
}