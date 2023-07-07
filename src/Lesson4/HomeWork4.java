package Lesson4;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class HomeWork4 {
    public static void main(String[] args) {
        //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        //Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


        // Пример переворота связанного списка
        LinkedList< Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList< Integer> reversedList = reverseLinkedList(list);
        System.out.println(" Перевернутый список:" + reversedList);

        // Пример использования связ. списка  для реализации очереди
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Первый элемент: " + queue.peek());
        System.out.println(" Извлеченный элемент: " + queue.poll());
        System.out.println(" Первый элемент после извлечения " + queue.peek());
    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer>list){
        LinkedList<Integer> reversedList = new LinkedList<>();
        Collections.reverse(list);
        return list;
    }
}
