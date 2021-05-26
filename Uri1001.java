import java.util.Scanner;

public class Uri1001 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int valor, A, nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        // entrada
        A = teclado.nextInt();

        // processamento
        valor = A;
        nota100 = A / 100;
        A = A % 100;
        nota50 = A / 50;
        A = A % 50;
        nota20 = A / 20;
        A = A % 20;
        nota10 = A / 10;
        A = A % 10;
        nota5 = A / 5;
        A = A % 5;
        nota2 = A / 2;
        A = A % 2;
        nota1 = A / 1;

        //saida
        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n",nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n",nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n",nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n",nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n",nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n",nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n",nota1);
    }
}