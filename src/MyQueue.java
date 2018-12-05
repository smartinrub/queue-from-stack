import java.util.Stack;

public class MyQueue<T> {

    private Stack<T> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void enqueue(T t) {
        stack.push(t);
    }

    public T dequeue() {
        Stack<T> auxStack = new Stack<>();
        T aux;

        if (stack.size() == 0) {
            throw new EmptyQueueException();
        }

        while (!stack.empty()) {
            auxStack.push(stack.pop());
        }

        aux = auxStack.pop();

        while (!auxStack.empty()) {
            stack.push(auxStack.pop());
        }

        return aux;
    }
}
