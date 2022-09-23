package ru.tests;

import ru.jessentials.tuple.*;
import ru.jessentials.utils.*;

public class MainTests {

	public static void main(String[] args) {
		tupleTest();
	}

	private static void strTest() {

		var str1 = "";
		var str2 = "   ";
		var str3 = "hhhhh";
		
		System.out.println(StringUtils.IsNotEmpty(str1));
		System.out.println(StringUtils.IsNotEmpty(str2));
		System.out.println(StringUtils.IsNotEmpty(str3));
		
		System.out.println();

		System.out.println(StringUtils.IsNotEmpty(str1, true));
		System.out.println(StringUtils.IsNotEmpty(str2, true));
		System.out.println(StringUtils.IsNotEmpty(str3, true));

		System.out.println();
		
		System.out.println(StringUtils.IsNotEmpty(str1, false));
		System.out.println(StringUtils.IsNotEmpty(str2, false));
		System.out.println(StringUtils.IsNotEmpty(str3, false));
	}
	
	private static void tupleTest() {
		var t2 = new TupleTwo<String, Integer>("test", 4);
		var t2other = new TupleTwo<String, Integer>("test", 4);
		System.out.println(t2.hashCode());
		System.out.println(t2other.hashCode());
		
		System.out.println(t2other.equals(t2));

		System.out.println(t2other == t2);
	}
	
}
