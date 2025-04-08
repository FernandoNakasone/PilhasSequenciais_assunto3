package ex01;

public class Main {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(17);
        fila.enqueue(0);

        if (!fila.isEmpty()){
            System.out.println("Valor que está no inicio da fila:" + fila.first());
        } else {
            System.out.println("Queue is empty!");
        }

        if (!fila.isEmpty()){
            System.out.println("Valor retirado da fila:" + fila.dequeue());
        } else {
            System.out.println("Queue is empty!");
        }

        if (!fila.isEmpty()){
            System.out.println("Valor retirado da fila:" + fila.dequeue());
        } else {
            System.out.println("Queue is empty!");
        }

        if (!fila.isEmpty()){
            System.out.println("Valor retirado da fila:" + fila.dequeue());
        } else {
            System.out.println("Queue is empty!");
        }
    }
}