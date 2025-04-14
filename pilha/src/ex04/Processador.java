package ex04;

import ex01.FilaInt;

import java.util.Scanner;


public class Processador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;

        do {
            System.out.println("1 - Insere 1 processo na fila");
            System.out.println("2 - Executa 1 processo");
            System.out.println("3 - Shutdown");
            System.out.print("Opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (fila.isFull()){
                        System.out.println("Fila lotada, execute um processo para conseguir inserir mais processos.");
                    } else {
                        System.out.print("pid do processo:");
                        int pid = sc.nextInt();
                        fila.enqueue(pid);
                    }
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há processos na fila.");
                    } else {
                       int pid = fila.dequeue();
                        System.out.print("Processo:" + pid + " está em execução.");
                        System.out.println("... processo foi concluido? (1-sim) (2-não): ");
                        int resp = sc.nextInt();
                        if (resp == 1){
                            System.out.println("Processo concluido.");
                        } else {
                            fila.enqueue(pid);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Sistema encerrado");
                    } else {
                        System.out.println("Ainda há processos a serem executados");
                        System.out.println("Deseja encerrar todos os processos? (1-sim) (2-não) :");
                        int resp = sc.nextInt();
                        if (resp == 1){
                            while (!fila.isEmpty()){
                                System.out.println("Processo pid: " + fila.dequeue() + " sendo encerrado...");
                            }
                            System.out.println("Todos os processos foram encerrados.");
                        } else {
                            System.out.println("Seleciona uma nova opção");
                            opcao = 0;
                        }
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
