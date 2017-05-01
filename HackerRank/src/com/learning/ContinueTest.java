package com.learning;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {
			if(i%2!=0)break;
			System.out.println(i+"\t");
		}
		
		for (int i=1;;){
			if(i<11){
				System.out.println(i+"\t");
				i++;
				continue;
			}else{			
				break;}
		}
	}

}
