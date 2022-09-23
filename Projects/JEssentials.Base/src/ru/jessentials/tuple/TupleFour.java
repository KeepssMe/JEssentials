package ru.jessentials.tuple;

import java.util.Objects;

public final class TupleFour<T1, T2, T3, T4> {

	private T1 item1;
	private T2 item2;
	private T3 item3;
	private T4 item4;
	
	public TupleFour(T1 item1, T2 item2, T3 item3, T4 item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
	}

	public T1 getItem1() {
		return item1;
	}
	
	public T2 getItem2() {
		return item2;
	}

	public T3 getItem3() {
		return item3;
	}
	
	public T4 getItem4() {
		return item4;
	}

	@Override
	public int hashCode() {
		return Objects.hash(item1, item2, item3, item4);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		@SuppressWarnings("rawtypes")
		TupleFour other = (TupleFour) obj;
		return Objects.equals(item1, other.item1) 
				&& Objects.equals(item2, other.item2)
				&& Objects.equals(item3, other.item3)
				&& Objects.equals(item4, other.item4);
	}

	@Override
	public String toString() {
		return "Tuple [" + item1 + ", " + item2 + ", " + item3 + ", " + item4 + "]";
	}
}
