package ru.jessentials.tuple;

import java.util.Objects;

public final class TupleOne<T1> {

	private T1 item1;
	
	public TupleOne(T1 item1) {
		this.item1 = item1;
	}
	
	public T1 getItem1() {
		return item1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(item1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		@SuppressWarnings("rawtypes")
		TupleOne other = (TupleOne) obj;
		return Objects.equals(item1, other.item1);
	}

	@Override
	public String toString() {
		return "Tuple [" + item1 + "]";
	}
}
