package dStack;

public class Main {

	public static void main(String[] args) {
		Dstack st=new Dstack(5);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(4);
		st.push(4);
		st.show();
		System.out.println();
	
		st.push(4);
        st.show();

        
        System.out.println();
        st.pop();
        st.pop();
        st.pop();
        st.show();


	}

}
