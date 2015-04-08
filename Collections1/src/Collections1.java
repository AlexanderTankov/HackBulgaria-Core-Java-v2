import java.util.Collection;
import java.util.Iterator;

import StackImpl.StackImpl;

public class Collections1 {

	
	public static boolean CheckBracketsIsValid(String expression) {
		StackImpl stack = new StackImpl();
		for (int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == '(') {
				stack.push(expression.charAt(i));
			} else {
				if(stack.length() == 0) {
					return false;
				}
				stack.pop();
			}
		}
		
		if(stack.length() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void ReverseCollection(Collection<Integer> collection) {
		Collection<Integer> result;
		
		int size = collection.size();
		
		for (int iter = size; iter > 0 ; iter--) {
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Collections1 c = new Collections1();
		System.out.println(c.CheckBracketsIsValid("()()())))((())("));
		System.out.println(c.CheckBracketsIsValid("())(()"));
		System.out.println(c.CheckBracketsIsValid("()()(())"));

	}

}
