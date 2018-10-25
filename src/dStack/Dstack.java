package dStack;

public class Dstack {
	
private int stack[], top=0,size;
	
	
	public Dstack(int size)
	{
		this.size=size;
		stack =new int[size];
	}
	
	public void push(int val) {
		if(top>=size)
			{System.out.println("OVERFLOW,creating new array of double size");
			expandTheStack();
			return;
			}

		stack[top]=val;
		top++;
	}
	
	private void expandTheStack() {
		int[] newStack=new int[2*size];
		System.arraycopy(stack, 0, newStack,0 , size);
		stack=newStack;
		size*=2;
	}

	public void pop() {
		if(isEmpty())
		{System.out.println("Underflow , nothing in stack");
		;}
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
