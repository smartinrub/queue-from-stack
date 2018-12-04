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
        T auxVal;

        if (stack.size() == 0) {
            throw new EmptyQueueException();
        }

        while (!stack.empty()) {
            auxVal = stack.pop();
            auxStack.push(auxVal);
        }

        auxVal = auxStack.pop();

        while (!auxStack.empty()) {
            stack.push(auxStack.pop());
        }

        return auxVal;
    }
}
