// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
class MyQueue {
    Node first,rear;
    public MyQueue() {
        // Initialize your data members
        first = null;
        rear = null;
    }
    public void push(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        if(first == null){
            first = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }    
    }
    
    public int pop() {
        // Removes the front element of the queue
        if(first == null)
        {
            return -1;
        }
        int val = first.data;   //  store value
        first = first.next ;
        if(first == null){
            rear = null ;
        } 
        return val;   
    }
    
    public int peek() {
        if(first == null) return -1;
        return first.data;
    }
    
    public boolean empty() {
        return first == null;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */