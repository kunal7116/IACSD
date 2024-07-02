package assignment1;


public class Main {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(8);
		ll.insert(1);
		ll.insert(2);
		ll.insert(5);
		ll.insert(7);
		ll.insert(4);
		System.out.println("Elements of LinkedList:-");
		ll.display();
		System.out.println("Max element "+ll.maxElement()); 
		System.out.println("Min element "+ll.minElement()); 
		System.out.println("Sum of Even Element "+ll.sumOfEvenElement());
	}

}
