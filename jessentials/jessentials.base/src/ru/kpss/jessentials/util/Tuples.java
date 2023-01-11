package ru.kpss.jessentials.util;

import ru.kpss.jessentials.tuples.*;

public class Tuples {

	public static <T1> TupleOne<T1> create(T1 t1) {
		return new TupleOne<>(t1);
	}
	
	public static <T1, T2> TupleTwo<T1, T2> create(T1 t1, T2 t2) {
		return new TupleTwo<>(t1, t2);
	}
	
	public static <T1, T2, T3> TupleThree<T1, T2, T3> create(T1 t1, T2 t2, T3 t3) {
		return new TupleThree<>(t1, t2, t3);
	}
	
	public static <T1, T2, T3, T4> TupleFour<T1, T2, T3, T4> create(T1 t1, T2 t2, T3 t3, T4 t4) {
		return new TupleFour<>(t1, t2, t3, t4);
	}
	
	public static <T1, T2, T3, T4, T5> TupleFive<T1, T2, T3, T4, T5> create(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
		return new TupleFive<>(t1, t2, t3, t4, t5);
	}
	
	public static <T1, T2, T3, T4, T5, T6> TupleSix<T1, T2, T3, T4, T5, T6> create(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
		return new TupleSix<>(t1, t2, t3, t4, t5, t6);
	}
	
	public static <T1, T2, T3, T4, T5, T6, T7> TupleSeven<T1, T2, T3, T4, T5, T6, T7> create(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
		return new TupleSeven<>(t1, t2, t3, t4, t5, t6, t7);
	}
	
	public static <T1, T2, T3, T4, T5, T6, T7, T8> TupleEight<T1, T2, T3, T4, T5, T6, T7, T8> create(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
		return new TupleEight<>(t1, t2, t3, t4, t5, t6, t7, t8);
	}
	
	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> TupleNine<T1, T2, T3, T4, T5, T6, T7, T8, T9> create(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
		return new TupleNine<>(t1, t2, t3, t4, t5, t6, t7, t8, t9);
	}
}
