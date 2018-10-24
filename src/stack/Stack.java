package stack;

public class Stack {
	private int stack[], top=0,size;
	
	
	public Stack(int size)
	{
		this.size=size;
		stack =new int[size];
	}
	
	public void push(int val) {
		if(top>=size)
			{System.out.println("OVERFLOW,stack is full");
			return;}

		stack[top]=val;
		top++;
	}
	
	public void pop() {
		if(isEmpty())
		{System.out.println("Underflow , nothing in stack");
		return;}
		stack[top-1]=0;
		top--;
	}
	
	//RETURN LAST ADDED ELEMENT TO STACK
	public int peek() {
		return stack[top-1];
	}
	
	public void show() {
		for (int i : stack) {
			System.out.print(" " + i);
		}
	}
	
	public int size() {
		return top;//returns the current size status not the actual allocated size
	}
	
	public boolean isEmpty() {
		return size()<=0;
	}

}
