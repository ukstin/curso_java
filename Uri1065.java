import java.util.Scanner;

public class Uri1065 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num, par = 0, impar = 0, positivo = 0, negativo = 0;

        for (int i = 1; i <= 5; i++) {
            num = teclado.nextInt();
            if ( num % 2 == 0 ) {
                par++;
            } else {
                impar++;
            }
            if ( num > 0) {
                positivo++;
            } else if ( num < 0 ) {
                negativo++;
            }
        }
        System.out.println(par +      " valor(es) par(es)");
        System.out.println(impar +    " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}