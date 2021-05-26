import java.util.Scanner;

public class Uri1064 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float num=0, media=0;
        int aux = 0;

        for (int i = 1; i <= 6; i++) {
            num = teclado.nextFloat();
            if ( num > 0 ) {
                aux++;
                media = media + num;
            }
        }
        media = media/aux;
        System.out.println(aux + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}