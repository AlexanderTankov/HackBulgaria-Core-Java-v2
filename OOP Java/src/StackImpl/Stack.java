package StackImpl;

public interface Stack {

	void push(Object element);

	Object pop();

	int length();

	void clear();

	boolean isEmpty();

	Object peek();
	
	void resize();
}
