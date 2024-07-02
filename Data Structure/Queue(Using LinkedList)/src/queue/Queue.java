package queue;

public class Queue {
	
	private Node head=null;
	private Node tail=null;
	

	public boolean isEmpty() {
	return head==null && tail==null;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(tail==null) {
			tail = head = newNode;
			return;
		}
		tail.setNext(newNode);
		tail = newNode;
	}
	
	public int remove() {
		if(isEmpty()) {
			return -1;
		}
		int front = head.getData();
		if(head==tail) {
			tail=null;
		}
		head = head.getNext();
		return front;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return head.getData();
	}

}
