package queueLinked;

public class QueueLinked {

	private int que[], numOfElements;
	Node front, rear;
	
	public int getNumOfElements() {
		return numOfElements;
	}



	public void enQueue(int data) {
		Node newNode= new Node(data);
		if(rear==null && front ==null) {
			front=rear=newNode;
			return;
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
	}



	public void deQueue() {
		if(rear==null && front ==null) {
			return;
		}
		else {
			front=front.next;
		}

	}


	public void show(Node node) {
//		for (int i : que) {
//			System.out.print(" " + i);
//		}
		while(node!=null) {
			System.out.print(node.data);
			node=node.next;
		}
	}
}
