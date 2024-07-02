package merge_two_list;

public class Main {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList ll1 = new LinkedList();
		
		ll1.insert(1);
		ll1.insert(5);
		ll1.insert(2);
		ll1.insert(6);
		ll1.insert(4);
		ll1.insert(8);
		ll1.insert(9);
		
		
//		
		ll.insert(20);
		ll.insert(50);
		ll.insert(70);
		ll.insert(60);
		ll.insert(90);
		ll.insert(10);
//		ll.display();
		
		ll.mergeTwoList(ll1);
		ll.display();

	}

}
