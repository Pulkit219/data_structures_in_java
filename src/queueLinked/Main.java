package queueLinked;


public class Main {

	public static void main(String[] args) {
		QueueLinked qu= new QueueLinked();
       qu.enQueue(4);
       qu.enQueue(3);
       qu.enQueue(6);
       qu.show(qu.front);
       qu.deQueue();
       System.out.println();
       qu.show(qu.front);
       
	}

}
