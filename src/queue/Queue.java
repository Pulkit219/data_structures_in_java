package queue;

public class Queue {
	
private int que[], numOfElements,front=-1,rear=-1;// front means 0th index on array since imagine a line so front person is the first one
//while rear means the end of the line means last index.

//the whole point is it works on FIFO so deletion happens from front while insertion happens from rear(tail) || then only it will make sense as FIFO
//Imagine Queue like the products are being put on conveyer belt and then one by one turns into finished product, so 1st item will come out first while last comes out last and if we add an item it will at the very end

public int getNumOfElements() {
	return numOfElements;
}


public Queue(int val) {
	que=new int [val];
}


//insertion of element at rear
public void enQueue(int data) {
	if((rear+1)%que.length==front)
	{
	System.out.println("OVERFLOW,Ququeue is full");
	return;
	}
	else if(Isempty()) {
	  front=rear=0;	  
	}
	else {
		rear=(rear+1)%que.length;	//we doing this instead of rear++ because this is circular queue implementation , this formula can reset rear to 0 and insert an element if front is >rear || it also works as rear++
	}
	que[rear]=data;
	numOfElements++;
}


//deletion of element at front
//when we perform delete operation here, we don't actually delete an element or make it 0, we just move our front pointer/index 1 step forward, so yes there is an empty space behind front selector
public void deQueue() {
	if(Isempty()) {
		System.out.println("already empty");
		return;
	}
	else if (front==rear) {
		front=rear=-1;
	}
	else {
		front=(front+1)%que.length;;
	}

}

public boolean Isempty() {
	return front==-1&&rear==-1;
}
public boolean IsFull() {
	return rear==que.length-1;
}

public void front() {
	
}

public void show() {
	for (int i : que) {
		System.out.print(" " + i);
	}
}
}
