package queue;

public class Main {

	public static void main(String[] args) {
		
		Queue qu= new Queue(5);
		qu.enQueue(5);
		qu.enQueue(6);
		qu.enQueue(7);
		qu.enQueue(8);
		qu.enQueue(9);

		qu.show();
		System.out.println();
		qu.enQueue(10);
		qu.deQueue();
		qu.enQueue(10);
		qu.show();

	}

}
