package stack;

public class Stack {
	
	private Node top;

	
	public boolean isEmpty() {
			return top == null; 

	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		//checking if stack is empty or not
		if(isEmpty()) {
			//if stack empty push the data to the top(on 1st position)
			top = newNode;
			return;
		}
		//of there is some data in stack then push the element next to them 
		//and assign head to that element
		newNode.setNext(top);
		top=newNode;
	}
	
	public int pop() {
		//checking if stack is empty or not
		if(isEmpty()) {
			//if its empty the return -1
			return -1;
		}
	//and if its not empty then remove the element and set top to the next element
	//top.getData();
	top= top.getNext();
	return 0;
	}
	
	public int peek() {
		//checking if stack is empty or not
		if(isEmpty()) {
			//if its empty return -1
			return -1;
		}
		//and if its not empty return the element that is at the top.
		return top.getData();
	}
	
	
}
