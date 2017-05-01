package com.learning;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n>=2 && n<=20){
        for (int i=1;i<11;i++){
        	int result=i*n;
        	System.out.println(n+" x "+i+" = "+result);
        }
        }else{
        	System.out.println("value of n is not in the range");
        }
        in.close();
    }
}

