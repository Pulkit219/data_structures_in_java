package stackLinkedList;

public class Main {

	public static void main(String[] args) {
		StackLinked st= new StackLinked();
		st.push(1);
		st.push(4);
		st.push(5);
		st.push(6);
		st.show(st.top);
		
		st.pop();
		st.show(st.top);
	}

}
