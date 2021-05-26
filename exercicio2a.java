import java.util.Scanner;

public class exercicio2a {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double lado, area;

        //entrada
        System.out.println("Digite o valor do lado: ");
        lado = teclado.nextDouble();

        area = lado * lado;

        System.out.println("A area do quadrado de lado " + lado + " vale " + area);
    }
}