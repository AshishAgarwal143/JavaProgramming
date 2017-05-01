package com.generics.array;

public class FindAllPrimeNumber {
	
	public boolean isPrime(int a){
		boolean flag=false;
		int y = (int) Math.ceil(Math.sqrt(a));
		for (int j = 2; j <= y; j++) {
			if (a % j == 0) {
				flag = true;
				break;
			}
		}
		return flag;		
	}
	
	public boolean isPrimeWhile(int a){
		boolean flag=false;
		int y = (int) Math.ceil(Math.sqrt(a));
		int j=2;
		while(j <= y){
			if (a % j == 0) {
				flag = true;
				break;
			}
			j++;
		}
		return flag;		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=50;
		FindAllPrimeNumber fin =new FindAllPrimeNumber();
		
		for(int i=4;i<a;i++){
			boolean flag;			
			flag=fin.isPrimeWhile(i);
			if (flag == false) {
				System.out.println( i);
			}
		}
		
	}

}
