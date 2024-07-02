package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.add(5);
		q.add(8);
		q.add(7);
		q.add(6);
		q.add(2);
		q.add(1);	
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
			//System.out.println(q.peek());
		}

	}

}
