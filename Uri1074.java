import java.util.Scanner;

public class Uri1074 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x, num, i = 1;

        x = teclado.nextInt();

        while ( i <= x ) {
            num = teclado.nextInt();
            if ( num % 2 == 0 ) {
                if ( num == 0 ) {
                    System.out.printf("NULL\n");
                } else {
                   System.out.printf("EVEN");
                }
            } else {
                System.out.printf("ODD");
            }
            if ( num < 0 ) {
                System.out.printf(" NEGATIVE\n");
            } else if ( num > 0) {
                System.out.printf(" POSITIVE\n");
            }
            i++;
        }
   }
}