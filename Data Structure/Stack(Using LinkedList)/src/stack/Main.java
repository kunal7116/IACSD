package stack;

public class Main {

	public static void main(String[] args) {
		//System.out.println("HEllo");
		Stack s1 = new Stack();
		s1.push(5);
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		
		while(s1.isEmpty()) {
			System.out.println( s1.peek());
			s1.pop();
		}
	}
	

}
