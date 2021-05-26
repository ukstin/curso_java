import java.util.Scanner;

public class Uri1048 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double sal, newSal, reajuste;

        sal = teclado.nextDouble();

        if (sal <= 400.00) { 
            reajuste = sal * 0.15;
            newSal = sal + reajuste;
            System.out.printf("Novo salario: %.2f\n", newSal);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if (sal > 400.00 && sal <= 800.00) {
            reajuste = sal * 0.12;
            newSal = sal + reajuste;
            System.out.printf("Novo salario: %.2f\n", newSal);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        }
        else if (sal > 800.00 && sal <= 1200.00) {
            reajuste = sal * 0.10;
            newSal = sal + reajuste;
            System.out.printf("Novo salario: %.2f\n", newSal);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if (sal > 1200.00 && sal <= 2000.00) {
            reajuste = sal * 0.07;
            newSal = sal + reajuste;
            System.out.printf("Novo salario: %.2f\n", newSal);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if (sal > 2000.00) {
            reajuste = sal * 0.04;
            newSal = sal + reajuste;
            System.out.printf("Novo salario: %.2f\n", newSal);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}