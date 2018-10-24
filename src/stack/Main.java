package stack;

public class Main {

	public static void main(String[] args) {
		Stack st=new Stack(5);
		System.out.println(st.isEmpty());
		st.pop();
		st.push(2);
		st.push(3);
		System.out.println(st.peek());
		st.push(4);
		
		st.push(4);
		st.push(4);
	
	
		
		st.show();
		System.out.println();
		
	
		
	}

}
