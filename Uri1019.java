import java.util.Scanner;

public class Uri1019 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int A, horas, minutos, segundos;

        // entrada
        A = teclado.nextInt();

        // processamento
        horas = A / 3600;
        minutos = (A % 3600) / 60;
        segundos = A % 3600 % 60;

        //saida
        System.out.printf("%d:%d:%s\n", horas, minutos, segundos);
    }
}