package com.arrays;

public class Program4 {
	static String reverse(String s) {
		String rev = "", temp = "";
		for (int i = 0; i < s.length() - 1; i++) {
			temp += s.charAt(i);
			if ((s.charAt(i) == ' ') || (i == s.length() - 1)) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					rev += temp.charAt(j);
					if ((j == 0) && (i != s.length() - 1))
						rev += " ";
				}
				temp = "";
			}
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is test";
		String revstr = reverse(str);
		System.out.println(revstr);
	}

}
