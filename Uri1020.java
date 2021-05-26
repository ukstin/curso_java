import java.util.Scanner;

public class Uri1020 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int idade, anos, meses, dias;

        // entrada
        idade = teclado.nextInt();

        // processamento
        anos = idade / 365;
        meses = (idade % 365) / 30;
        dias = ((idade % 365) % 30);
        //saida
        System.out.printf("%d ano(s)\n",anos);
        System.out.printf("%d mes(es)\n",meses);
        System.out.printf("%d dia(s)\n",dias);
    }
}