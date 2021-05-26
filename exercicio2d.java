import java.util.Scanner;

public class exercicio2d {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double diagonal1, diagonal2, area;

        //entrada
        System.out.println("Digite o valor da diagonal1 do losango: ");
        diagonal1 = teclado.nextDouble();

        System.out.println("Digite o valor da diagonal2 do losango: ");
        diagonal2 = teclado.nextDouble();

        area = diagonal1 * diagonal2;

        System.out.println("A area do losango com as diagonais " + diagonal1 + " e " + diagonal2 + " vale " + area);
    }
}