package StackImpl;

import java.util.ArrayList;
import List.List;

public class StackImpl implements Stack {
	
	private int size;
	private List data;
	private int capacity;
	
	public StackImpl(){
		this.size = 0;
		this.data = new List() ;
		this.capacity = 2;
	}

	@Override
	public void push(Object element) {
		if (this.size == this.capacity) {
			this.resize();
		}
		this.data.add(element);
		this.size++;
	}

	@Override
	public Object pop() {
		if(size == 0) {
			return new Object();
		} else {	
			Object result = this.data.get(this.size - 1);
			data.remove(size - 1);
			size--;
			return result;
		}
	}

	@Override
	public int length() {
		return this.size;
	}

	@Override
	public void clear() {
		this.data.clear();
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public Object peek() {
		if(size == 0) {
			return new Object();
		} else {
			return data.get(size);
		}
	}

	@Override
	public void resize() {
	}
	
}
