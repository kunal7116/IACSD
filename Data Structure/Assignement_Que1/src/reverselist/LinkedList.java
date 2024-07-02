package reverselist;

public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public boolean insert(int data) {
		Node n1 = new Node(data);
		if (n1 == null) {
			return false;
		}
		if (head == null) {
			head = n1;
			return true;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(n1);
		return true;

	}

	public void display() {
		Node temp = head;
		if (head == null) {
			return;
		}
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}
	public void reverse() {
		Node n1=head;
		Node n2=head.getNext();
		while(n2!=null) {
			Node n3=n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;
		}
		head.setNext(null);
		head=n1;
		
	}



}