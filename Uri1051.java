import java.util.Scanner;

public class Uri1051 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double num, aux;

        num = teclado.nextFloat();

        if (num >= 0 && num <= 2000) { 
            System.out.println("Isento");
        }
        else if (num > 2000 && num <= 3000) {
            num = (num - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", num);
        }
        else if (num > 3000 && num <= 4500) {
            aux = (num - 3000);
            num = (1000 * 0.08) + (aux * 0.18);
            System.out.printf("R$ %.2f\n", num);
        }
        else if (num > 4500) {
            aux = (num - 4500);
            num = (1000 * 0.08) + (1500 * 0.18) + (aux * 0.28);
            System.out.printf("R$ %.2f\n", num);
        }
    }
}