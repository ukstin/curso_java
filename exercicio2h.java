import java.util.Scanner;

public class exercicio2h {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double raio, altura, area;

        //entrada
        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextDouble();

        area = 3.14 * raio * raio * altura;

        System.out.printf("A area do cilindro de raio eh &.2f", area);
    }
}