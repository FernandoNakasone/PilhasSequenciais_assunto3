package ex02;

import java.util.Scanner;

public class AtendimentosAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("1 - Insere 1 aluno na fila");
            System.out.println("2 - Atende 1 aluno");
            System.out.println("3 - Encerra atendimento");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:

                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("Atendimento encerrado");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 3);

        sc.close();
;    }
}
