package assignment1;

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
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(newNode == null)
		{
		return false;
		}
		
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
	
	public int maxElement() {
		Node temp = head;
		int ans = 0;
		while(temp!=null) {
			if(temp.getData()>ans) {
				ans=temp.getData();
			}
		temp = temp.getNext();	
		}
		return ans;
	}

	public int minElement() {
		Node temp = head;
		int ans = Integer.MAX_VALUE;
		while(temp!=null) {
			if(temp.getData()<ans) {
				ans=temp.getData();
			}
		temp = temp.getNext();	
		}
		return ans;
	}

	public int sumOfEvenElement() {
		Node temp = head;
		int sum = 0;
		while(temp!=null) {
			if(temp.getData()%2==0) {
				sum = sum+temp.getData();
			}
			temp = temp.getNext();
		}
		return sum;
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
