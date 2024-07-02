package duplicate_node;

public class Main {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.insert(20);
		ll.insert(10);
		ll.insert(50);
		ll.insert(10);
		ll.insert(70);
		ll.insert(60);
		ll.insert(10);
		ll.insert(90);
		ll.insert(10);
		ll.display();
		System.out.println();
		
		while(ll.remove(10));
	
		ll.display();

	}

}
