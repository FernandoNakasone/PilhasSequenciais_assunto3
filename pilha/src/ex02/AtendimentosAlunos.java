package ex02;

import ex01.FilaInt;

import java.util.Scanner;


public class AtendimentosAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;

        do {
            System.out.println("1 - Insere 1 aluno na fila");
            System.out.println("2 - Atende 1 aluno");
            System.out.println("3 - Encerra atendimento");
            System.out.print("Opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("RM do aluno:");
                    int rm = sc.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há alunos aguardando na fila.");
                    } else {
                        System.out.println("Aluno a ser atendido agora :RM " + fila.dequeue());
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Atendimento encerrado");
                    } else {
                        System.out.println("Ainda há alunos a serem atendidos");
                        System.out.println("Seleciona uma nova opção");
                        opcao = 0;
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("--------------------------------------------------------------------------------");

        } while (opcao != 3);

        sc.close();
    }
}
