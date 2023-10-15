/*Java String Program to Iterate Over Characters in String*/
package com.practiceinmain;

import java.util.HashSet;
import java.util.Iterator;

public class StringCharacterIterator {

	public static void main(String[] args) {
		String str = "Java is a programming language";

		// first way of iteration using for loop
		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("**********end***********");

		// second way of iteration using iterator
		HashSet<String> hs = new HashSet<String>();
		hs.add(str);
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**************end**************");

		// third way by creating the char array and passing the string characters inside
		// it
		char[] crr = new char[str.length()];
		for (int k = 0; k <= str.length() - 1; k++) {
			char ch = str.charAt(k);
			crr[k] = ch;
		}
		for (char a : crr) {
			System.out.println(a);
		}
	}

}
