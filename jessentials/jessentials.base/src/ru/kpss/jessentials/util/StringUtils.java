package ru.kpss.jessentials.util;

public final class StringUtils {

	public static boolean isNullOrEmpty(final String str) {
		return isNullOrEmpty(str, true); 
	}
	
	public static boolean isNullOrEmpty(final String str, final boolean isBlank) {
		return str == null || (isBlank ? str.isBlank() : str.isEmpty());
	}
	
	public static int compareTo(final String str1, final String str2) {
		return str1 == null ?
				(str2 == null ? 0 : -1) :
				(str2 == null ? 1 : str1.compareTo(str2));
	}
	
	public static boolean contains(final String str1, final String str2) {
		return str1 != null && str2 != null ? str1.contains(str2) : false;
	}
	
}
