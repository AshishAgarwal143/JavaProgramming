package com.generics.array;

public class Printer {
	public <T> void printArray(T[] array){
		
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\n");
            
        }
       
	}

}
