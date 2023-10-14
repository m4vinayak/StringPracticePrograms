/*Java String Program to Check Anagram
*/

package com.practiceinmain;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		char[] str1 = {'l','i','s','t','e','n'};
		char[] str2 = {'s','i','l','e','n','t'};
		
		if(str1.length != str2.length) {
			System.out.println("Both strings are not 'Anagram'");
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		int count = 0;
		for(int i = 0; i<=str1.length-1; i++) {
			if(str1[i] != str2[i]) {
				count = 0;
				}else {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("Both strings are not 'Anagram'");
		}else {
			System.out.println("Both strings are 'Anagram'");
		}
	}
}
