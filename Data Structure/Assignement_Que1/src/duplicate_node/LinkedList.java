package duplicate_node;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}

	public boolean insert(int data) {
	 Node n1 = new Node(data);
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
	
	public boolean remove(int data) {
		
		if(head == null) {
            return false;
        }

        if(head.getData() == data) {
            head = head.getNext();
            return true;
        }
		
		Node del = head;
		Node prev = head;
		while(del.getData()!=data) {
			prev=del;
			del = del.getNext();
			if(del==null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
		
	}
	
}
