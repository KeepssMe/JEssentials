package ru.tests;

import ru.jessentials.utils.StringUtils;

public class MainTests {

	public static void main(String[] args) {
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

}
