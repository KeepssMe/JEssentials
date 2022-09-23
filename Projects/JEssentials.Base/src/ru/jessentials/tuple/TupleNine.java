package ru.jessentials.tuple;

import java.util.Objects;

public final class TupleNine<T1, T2, T3, T4, T5, T6, T7, T8, T9> {

	private T1 item1;
	private T2 item2;
	private T3 item3;
	private T4 item4;
	private T5 item5;
	private T6 item6;
	private T7 item7;
	private T8 item8;
	private T9 item9;
	
	public TupleNine(T1 item1, T2 item2, T3 item3, T4 item4, T5 item5, T6 item6, T7 item7, T8 item8, T9 item9) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
		this.item7 = item7;
		this.item8 = item8;
		this.item9 = item9;
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

	public T5 getItem5() {
		return item5;
	}

	public T6 getItem6() {
		return item6;
	}

	public T7 getItem7() {
		return item7;
	}

	public T8 getItem8() {
		return item8;
	}

	public T9 getItem9() {
		return item9;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(item1, item2, item3, item4, item5, item6, item7, item8, item9);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		@SuppressWarnings("rawtypes")
		TupleNine other = (TupleNine) obj;
		return Objects.equals(item1, other.item1) 
				&& Objects.equals(item2, other.item2)
				&& Objects.equals(item3, other.item3)
				&& Objects.equals(item4, other.item4)
				&& Objects.equals(item5, other.item5)
				&& Objects.equals(item6, other.item6)
				&& Objects.equals(item7, other.item7)
				&& Objects.equals(item8, other.item8)
				&& Objects.equals(item9, other.item9);
	}

	@Override
	public String toString() {
		return "Tuple [" + item1 + ", " + item2 + ", " + item3 + ", " + item4 + ", " + item5 + ", " + item6 + ", " + item7 + ", " + item8 + ", " + item9 + "]";
	}
}
