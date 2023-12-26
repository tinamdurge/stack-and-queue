public class App {
    public static void main(String[] args) throws Exception {

        // creating a Queue
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // prints the Queue horizontally
        // i.e. first element is the first element of queue
        System.out.println(queue);

        // UC4: dequeue method
        queue.dequeue();
        System.out.println(queue);
    }
}