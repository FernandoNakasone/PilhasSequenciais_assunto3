package ex05;

import java.util.Scanner;

public class Consultorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaString fila = new FilaString();
        fila.init();
        int opcao;

        do {
            System.out.println("1 - Insere 1 paciente na fila");
            System.out.println("2 - Atende 1 paciente");
            System.out.println("3 - Encerrar atendimentos");
            System.out.print("Opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if(fila.isFull()){
                        System.out.println("Fila lotada, atenda um paciente para conseguir inserir mais pacientes.");
                    } else {
                        System.out.print("Nome do paciente:");
                        String nome = sc.next();
                        fila.enqueue(nome);
                    }
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há pacientes aguardando na fila.");
                    } else {
                        System.out.println("Paciente a ser atendido agora: " + fila.dequeue());
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Atendimentos encerrados");
                    } else {
                        System.out.println("Ainda há pacientes a serem atendidos");
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
