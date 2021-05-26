import java.util.Scanner;

public class Uri1047 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int horaInicio, horaFim, minInicio, minFim, duracaoH, duracaoM;

        horaInicio = teclado.nextInt();
        minInicio = teclado.nextInt();
        horaFim = teclado.nextInt();
        minFim = teclado.nextInt();

        if (minInicio == minFim) { 
            if (horaInicio == horaFim) {
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
            if (horaInicio < horaFim) {
                duracaoH = horaFim - horaInicio;
                System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)\n", duracaoH);
            }
            else if (horaInicio > horaFim) {
                duracaoH = 24 - horaInicio + horaFim;
                System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)\n", duracaoH);
            }
        }
        if (minInicio < minFim) { 
            if (horaInicio == horaFim) {
                duracaoM = minFim - minInicio;
                System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n", duracaoM);
            }
            if (horaInicio < horaFim) {
                duracaoM = minFim - minInicio;
                duracaoH = horaFim - horaInicio;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoH, duracaoM);
            }
            else if (horaInicio > horaFim) {
                duracaoM = minFim - minInicio;
                duracaoH = 24 - horaInicio + horaFim;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoH, duracaoM);
            }
        }
        if (minInicio > minFim) { 
            if (horaInicio == horaFim) {
                duracaoM = 60 - minInicio + minFim;
                System.out.printf("O JOGO DUROU 23 HORA(S) E %d MINUTO(S)\n", duracaoM);
            }
            if (horaInicio < horaFim) {
                duracaoM = 60 - minInicio + minFim;
                duracaoH = (horaFim - horaInicio) -1;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoH, duracaoM);
            }
            else if (horaInicio > horaFim) {
                duracaoM = 60 - minInicio + minFim;
                duracaoH = (24 - horaInicio + horaFim) -1;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoH, duracaoM);
            }
        } 
    }
}