package ru.jessentials.utils;

public final class StringUtils {

	public static boolean IsNotEmpty(String str) {
		return IsNotEmpty(str, true); 
	}
	
	public static boolean IsNotEmpty(String str, boolean isBlank) {
		return str != null && !(isBlank ? str.isBlank() : str.isEmpty());
	}
	
}
