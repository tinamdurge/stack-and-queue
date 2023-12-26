public class Stack<T> extends LinkedList<T> {

    public Stack() {
        super();
    }

    // UC1: add push method to stack
    public void push(T data) {
        super.add(data); // using add to last method of linked list
    }

    // UC2: adding peek and pop methods to stack
    public T peek() {
        if (this.size() == 0) {
            System.out.println("The Stack is empty.");
            return null;
        }
        return this.tail.data;
    }

    public void pop() {
        if (this.size() == 0) {
            System.out.println("The Stack is empty.");
            return;
        }
        super.deleteLast();
    }
}
