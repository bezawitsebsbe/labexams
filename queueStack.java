package question2;
public class queueStack {
	private stackimplement stack1; // For enqueue operation
    private stackimplement stack2; // For dequeue operation

    public queueStack() {
        stack1 = new stackimplement(4);
        stack2 = new stackimplement(5);
    }

    
    public void enqueue(int item) {
        stack1.push(item);
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
      
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
    public boolean isEmpty() {
        return (stack1.isEmpty() && stack2.isEmpty());
        }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }


    // Print the elements of the queue
public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.print("Queue: ");
        for (int i = stack2.size - 1; i >= 0; i--) {
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();
    }
    

    // Main method to test the QueueUsingStack class
    public static void main(String[] args) {
        queueStack queue = new queueStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.displayQueue(); // Output: Queue: 10 20 30 40

        System.out.println("Front element: " + queue.peek()); // Output: Front element: 10

        queue.dequeue();
        queue.displayQueue(); // O
       // queue.dequeue();
        //queue.displayQueue(); // Output: Queue: 20 30 40
       

}
}
