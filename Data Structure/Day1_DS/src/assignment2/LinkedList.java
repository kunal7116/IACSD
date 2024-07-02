package assignment2;


public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	//inserting elements in the linked list
	public boolean insert(Product p) {
		Node newNode = new Node(p);
//		if(newNode == null)
//		{
//		return false;
//		}
		
		if(head==null)
		{
			head = newNode;
		    return true;
		}
		Node temp = head;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return true;
		  
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}
