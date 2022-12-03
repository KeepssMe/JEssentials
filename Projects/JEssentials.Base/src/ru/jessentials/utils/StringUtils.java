package ru.jessentials.utils;

public final class StringUtils {

	public static boolean IsNullOrEmpty(String str) {
		return IsNullOrEmpty(str, true); 
	}
	
	public static boolean IsNullOrEmpty(String str, boolean isBlank) {
		return str == null || (isBlank ? str.isBlank() : str.isEmpty());
	}
	
}
