package com.learning;

import java.util.Scanner;

public class Solution1 {
public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int k = sn.nextInt();
    for (int i=0;i<n;i++){
    	for(int j=0;j<k;j++){
    		if (n==k){
    			System.out.println("chapter no is equal to problem");
    		}else{
    			System.out.println("chapter no not equal to problems");
    		}
    	}
    }
sn.close();

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}
}