package List;

public class List {

	public class Node {
		
		private Node previous;
		private Object data;
		private Node next;
		
		Node() {
			this.previous = null;
			this.data = 0;
			this.next = null;
		}
		
		Node(Object data) {
			this.previous = null;
			this.data = data;
			this.next = null;
		}
		
		Node getPrevious() {
			return this.previous;
		}
		
		Node getNext() {
			return this.next;
		}
		
		Object getData() {
			return this.data;
		}
		
		void setPrevious(Node previous) {
			this.previous = previous;
		}
		
		void setNext(Node next) {
			this.next = next;
		}
		
		void setData(int data) {
			this.data = data;
		}
	}
	
	private Node firstElem;
	private int listCount;
	
	public List() {
		this.firstElem = new Node();
		this.listCount = 0;
	}
	
	public List(Node firstElem) {
		this.firstElem = firstElem;
		this.listCount = 1;
	}
	
	public void add(Object elem) {
		Node newElem = new Node(elem);
		if(this.listCount == 0) {
			this.firstElem = newElem;
		} else {
			Node currentHead = this.firstElem;
			while(currentHead.getNext() != null) {
				currentHead = currentHead.getNext();
			}
			
			currentHead.setNext(newElem);
			newElem.setPrevious(currentHead);
			this.listCount++;
		}
	}
	
	public void remove(int elementIndex) {
		if(this.listCount <= elementIndex || elementIndex > 0) {
			Node currentHead = this.firstElem;
			for (int i = 1; i < elementIndex; i++) {
				currentHead = currentHead.getNext();
			}
			currentHead.setNext(currentHead.getNext().getNext());
			if(currentHead.getNext().getNext() != null) {
				currentHead.getNext().getNext().setPrevious(currentHead);
			}
			this.listCount--;
		} else {
			System.out.println("This is out of range!");
		}
	}
	
	public int size() {
		return this.listCount;
	}
	
	public Node get(int elementIndex) {
		if(this.listCount <= elementIndex) {
			Node currentHead = this.firstElem;
			for (int i = 1; i < elementIndex; i++) {
				currentHead = currentHead.getNext();
			}
			return currentHead.getNext();
		} 
		return new Node();
	}
	
	public Object getHead() {
		return this.firstElem.getData();
	}
	
	public Node getTail() {
		Node currentHead = this.firstElem;
		for (int i = 1; i < this.listCount; i++) {
			currentHead = currentHead.getNext();
		}
		return currentHead.getNext();
	}
	
	public void clear() {
		this.firstElem = new Node();
	}

}
