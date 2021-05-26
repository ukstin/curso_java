import java.util.Scanner;

public class exercicio2c {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        //entrada
        System.out.println("Digite o valor da base: ");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextDouble();

        area = (base * altura)/2;

        System.out.println("A area do triangulo de base " + base + " e altura " + altura + " vale " + area);
    }
}