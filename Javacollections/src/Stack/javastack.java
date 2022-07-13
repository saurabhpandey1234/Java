package Stack;

import java.util.Stack;

public class javastack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack();
		stack.push(13);
		stack.push(12);
		stack.push(11);
		stack.push(15);

		System.out.println("Total size of the Stack :"+ stack.size());
		System.out.println("Element of the stack : "+stack);
		
		for(int i=0;i<stack.size();i++) {
			System.out.println(stack);
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
