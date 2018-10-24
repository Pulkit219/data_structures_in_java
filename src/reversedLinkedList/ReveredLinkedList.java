package reversedLinkedList;

public class ReveredLinkedList {
	
	
	  static Node head; //constant head var used , no matter how long the list is!
	 
	  
	  //Node class for generating new Nodes
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
 
//	public void addToTheLast(Node node) {
//		if (head == null) {
//			head = node;
//		} else {
//			Node temp = head;
//			while (temp.next != null)
//				temp = temp.next;
// 
//			temp.next = node;
//		}
//	}
 
 
	public void printList(Node node) {
		
		while (node != null) {
			System.out.format("%d ", node.value);
			node = node.next;
		}
		System.out.println();
	}
 
	// Reverse linked list using this function 
	public  Node reverseLinkedList(Node currentNode)
	{
		
		Node previousNode=null; // For first node, previousNode will be null if we reverse the list
		Node nextNode;
		while(currentNode!=null)
		{
			nextNode=currentNode.next;//save the next link in next variable so we can traverse the list further
			currentNode.next=previousNode;//reversing the pointer so next will point to back
			previousNode=currentNode;//saving current in prev so in loop when we get to next node, next node can point to this one as prev one
			currentNode=nextNode;//finally setting the current variable to next so loop keeps moving on
		}
		currentNode=previousNode;
		return currentNode;
	}
 
	public static void main(String[] args) {
		ReveredLinkedList list = new ReveredLinkedList();

		    list.head = new Node(5); 
	        list.head.next = new Node(6); 
	        list.head.next.next = new Node(7); 
	        list.head.next.next.next = new Node(8); 
		    list.printList(head);
		
		//Reversing LinkedList
		head=list.reverseLinkedList(head); // here reverseLinkedList function is returning the last element once while loop is over and then we set it as head by head =returned value
		//So now head is pointing to last element and of course if we traverse from last element to the first it's reversed!!
		System.out.println("After reversing");
		list.printList(head);
		System.out.println("back to original");
		head=list.reverseLinkedList(head);
		list.printList(head);
	}
 
}



