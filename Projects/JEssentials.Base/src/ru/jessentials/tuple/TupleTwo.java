package ru.jessentials.tuple;

import java.util.Objects;

public final class TupleTwo<T1, T2> {

	private T1 item1;
	private T2 item2;
	
	public TupleTwo(T1 item1, T2 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	public T1 getItem1() {
		return item1;
	}
	
	public T2 getItem2() {
		return item2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(item1, item2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		@SuppressWarnings("rawtypes")
		TupleTwo other = (TupleTwo) obj;
		return Objects.equals(item1, other.item1) 
				&& Objects.equals(item2, other.item2);
	}

	@Override
	public String toString() {
		return "Tuple [" + item1 + ", " + item2 + "]";
	}
}
