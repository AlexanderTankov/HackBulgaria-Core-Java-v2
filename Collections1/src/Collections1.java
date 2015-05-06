import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import StackImpl.StackImpl;

public class Collections1 {

	
	public boolean CheckBracketsIsValid(String expression) {
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
	
		List<Integer> temp = new ArrayList<Integer>();
    
	 	Iterator<Integer> itr = collection.iterator();
	 	while (itr.hasNext()) {
	 		Integer myInt = (Integer) itr.next();
	 		temp.add(myInt);
	 	}
	 	
	 	Collections.reverse(temp);
	 	collection.clear();
	
	 	ListIterator<Integer> tempResult = temp.listIterator();

	    while (tempResult.hasNext()){
	        collection.add(tempResult.next());
	    }
	    System.out.println(collection);
	}
	
	public static void main(String[] args) {
		Collections1 c = new Collections1();
		System.out.println(c.CheckBracketsIsValid("()()())))((())("));
		System.out.println(c.CheckBracketsIsValid("())(()"));
		System.out.println(c.CheckBracketsIsValid("()()(())"));
		Stack<Integer> coins = new Stack<Integer>();
		coins.push(1);
		coins.push(2);
		coins.push(3);
		coins.push(4);
		coins.push(5);
		coins.push(6);
		ReverseCollection(coins);
	}

}
