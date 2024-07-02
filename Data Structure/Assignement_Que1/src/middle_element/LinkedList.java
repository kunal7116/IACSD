package middle_element;

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

	public void middleElement() {
		System.out.println();
		Node temp = head;
		Node mid = temp;

		int count = 0;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			++count;
			if (count % 2 == 0) {
				mid = mid.getNext();
			}
		}
		if (count % 2 == 0) {
			System.out.println(mid.getData());
		} else {
			System.out.println(mid.getData() + " " + mid.getNext().getData());
		}

	}

}