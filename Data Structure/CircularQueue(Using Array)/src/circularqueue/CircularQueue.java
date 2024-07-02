package circularqueue;

public class CircularQueue {
	private int arr[];
	private int size;
	private int rear =-1; 
	private int front =-1;
	
	
	public CircularQueue(int size) {
		arr =  new int[size];
		this.size=size;
	}
	
	public boolean isEmpty() {
		return rear== -1 && front == -1;
		
	}
	public boolean isFull() {
		return (rear+1)%size == front;
	}
	
	public void insert(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if(front==-1) {
			front = 0;
		}
		rear= (rear+1)%size;
		arr[rear] =data;
	}
	
	public int remove() {
		 if(isEmpty()) {
			 System.out.println("Queue is empty");
		 }
		 int result = arr[front];
		 if(rear == front) {
			 rear = front = -1;
		 }
		 else {
			 front = (front+1)%size;
		 }
		 return result;
	}
	
	public int peek() {
		 if(isEmpty()) {
			 System.out.println("Queue is empty");
			
		 }
		 return arr[front];
	}
	
}
