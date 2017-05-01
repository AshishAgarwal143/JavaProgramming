package com.arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Array1 a1= new Array1();
		Array1 a2 = new Array1();
		
		int x = a1.getinstanceof();	
		System.out.println("value of x " + x);
		
		int y = a2.getinstanceof();	
		System.out.println("value of y " + y);
		*/
		
		String a ="abcadadfsgfjhgukhasdcgbabcdefghjjkadbcabc!!";
		String b ="ABC";
		String c =" ";
		
		boolean f = a.contains(b);
		int x = a.indexOf(b);
		int y =a.indexOf(b.toLowerCase());
		System.out.println(f);
		
		System.out.println(x);
		System.out.println(y);
		
		if (a.startsWith(b.toLowerCase())){
			System.out.println("removing abc from start "+a.substring(b.length()));
		}else {
			System.out.println("adding abc at the start "+b.toLowerCase().concat(a));
		}
		
		if (a.contains(b.toLowerCase())){
			System.out.println(a.replaceAll(b.toLowerCase(), "\\$"));
		}
		System.out.println(a);
		System.out.println(c);
		
		}

}
