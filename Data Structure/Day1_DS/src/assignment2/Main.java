package assignment2;

public class Main {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		Product p1 = new Product(2,5,78);
		Product p2 = new Product(8,58,89);
		Product p3 = new Product(3,5,98);
		Product p4 = new Product(9,50,30);
		Product p5 = new Product(10,5,65);
		Product p6 = new Product(2,36,32);
		
		l1.insert(p1);
		l1.insert(p2);
		l1.insert(p3);
		l1.insert(p4);
		l1.insert(p5);
		l1.insert(p6);
		
		l1.display();

	}

}
