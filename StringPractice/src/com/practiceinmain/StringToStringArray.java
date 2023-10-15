package com.practiceinmain;

public class StringToStringArray {

	public static void main(String[] args) {
		String str = "java is portable";
		char[] crr = new char[str.length()];
		for (int i = 0; i <= str.length() - 1; i++) {
			crr[i] = str.charAt(i);
		}
		for (char ch : crr) {
			System.out.println(ch);
		}
	}
}
