package circularqueue;

public class Main {

	public static void main(String[] args) {
		CircularQueue c = new CircularQueue(5);
		
		c.insert(5);
//		c.insert(6);
//		c.insert(7);
//		c.insert(9);
//		c.insert(10);
		System.out.println(c.remove()); 
		System.out.println(c.remove()); 
//		c.insert(12);
//		System.out.println(c.remove());
//		c.insert(1);
		
		while(!c.isEmpty()) {
			System.out.println(c.peek());
			c.remove();
		}
	}

}
