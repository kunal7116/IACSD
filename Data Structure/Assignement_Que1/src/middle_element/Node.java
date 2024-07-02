package middle_element;

public class Node {
	private Node next;
	private int data;
	
	
	public Node(int data) {
		super();
		this.next = null;
		this.data = data;
	}


	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}
	
	
	

}
