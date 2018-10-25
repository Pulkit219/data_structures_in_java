package stackLinkedList;

public class StackLinked {
	
	 Node top;
	
	
	
	public void push(int val) {
		
	    Node newNode=new Node(val);
	    if(top==null) { // checking if stack is empty
	    	newNode.next=null;// yes it is so it's next will be null because first node in stack means like last node and last node points to null!!
	    }     
        newNode.next=top;//whatever new node is created, it' next is always where top is pointing now
		top=newNode;//and now we set the top pointer to new node because top points to newly created nodes!! that'w how stack works
	
	
	}
	
	public void pop() {
		int val=0;
	    if(top==null) {// checking if stack is empty
	    	System.out.println("nothing to delete, linked stack is empty already!");
	    	return;
	    }
	    val=top.data;
	    System.out.println(val + " " + "is popped out");
	    top=top.next;// just setting the top to its next link because we deleted current node
      
	}
	
	public void show(Node node) { //traversing the list to show all elements
	   System.out.println("Stack is ");
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
			
		}
	}


}
