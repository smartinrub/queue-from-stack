public class Main {

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.enqueue("Hello");
        myQueue.enqueue("world");
        myQueue.enqueue("from");
        myQueue.enqueue("London");
        myQueue.enqueue("!");

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
