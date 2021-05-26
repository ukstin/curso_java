import java.util.Scanner;

public class Uri1038 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int cod, qtd;
        double total;

        // entrada
        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        // processamento
        if (cod == 1) { 
            total = qtd * 4.0;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (cod == 2) {
            total = qtd * 4.5;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (cod == 3) {
            total = qtd * 5.0;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (cod == 4) {
            total = qtd * 2;
            System.out.printf("Total: R$ %.2f\n", total);
        }
        else if (cod == 5) {
            total = qtd * 1.5;
            System.out.printf("Total: R$ %.2f\n", total);
        }
    }
}