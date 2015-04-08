
public final class Pair {
	
	Pair() {
		this.key = 0;
		this.value = 0;
	}
	

	public Object getKey()
	{
		return this.key;
	}
	
	public Object getValue()
	{
		return this.value;
	}
	
	public String toString() {
		return this.key + ": " + this.value;
	}
	
	@Override
	public boolean equals(Object other) {
		Pair copyOfOther = (Pair)other;
		return this.key == copyOfOther.getKey() && this.value == copyOfOther.getValue();
	}
	
	private final Object key;
	private final Object value;

}
