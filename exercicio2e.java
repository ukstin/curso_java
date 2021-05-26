import java.util.Scanner;

public class exercicio2e {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double baseMaior, basemenor, altura, area;

        //entrada
        System.out.println("Digite o valor da base menor do trapezio: ");
        basemenor = teclado.nextDouble();

        System.out.println("Digite o valor da base maior do trapezio: ");
        baseMaior = teclado.nextDouble();

        System.out.println("Digite o valor da altura do trapezio: ");
        altura = teclado.nextDouble();

        area = ((basemenor + baseMaior) * altura) / 2;

        System.out.println("A area do trazeio de bases " + basemenor + " e " + baseMaior + " e altura " + altura + " eh: " + area);
    }
}