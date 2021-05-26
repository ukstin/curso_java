import java.util.Scanner;

public class Uri1073 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x, aux = 0;

        x = teclado.nextInt();
        if ( x > 5 && x <= 2000 ) {
            for ( int i = 2; i <= x; i+=2 ) {
                aux = i * i;
                System.out.printf("%d^2 = %d\n",i,aux);
            }
        }
    }
}