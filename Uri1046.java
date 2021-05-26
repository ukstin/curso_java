import java.util.Scanner;

public class Uri1046 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int horaInicio, horaFim, duracao;

        horaInicio = teclado.nextInt();
        horaFim = teclado.nextInt();

        if (horaInicio == horaFim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }
        else if (horaInicio > horaFim) {
            duracao = 24 - horaInicio + horaFim;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }
    }
}