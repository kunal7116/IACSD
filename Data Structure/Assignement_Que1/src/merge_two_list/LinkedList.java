package merge_two_list;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}

	public boolean insert(int data) {
	 Node n1 = new Node(data);
	 if(n1==null) {
		 return false;
	 }
	 if(head==null) {
		 head=n1;
		 return true;
	 }
	 Node temp = head;
	 while(temp.getNext()!=null) {
		 temp = temp.getNext();
	 }
	 temp.setNext(n1);
		return true;
		
	}
	
	
	public void display() {
		Node temp = head;
		if(head==null) {
			return;
		}
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
	public void mergeTwoList(LinkedList l2) {
		Node temp = head;
		if(head==null) {
			head=l2.head;
			return;
		}
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		temp.setNext(l2.head);
	}
	
	
	
}
