package com.arrays;

public class Tables {
	
	public static int [][] multiTable(int r, int c){
		int [][] temp =new int[r][c];
		for (int row=0;row<temp.length;row++){
			for (int col =0;col<temp[row].length;col++){
				temp [row][col]= (row+1)*(col+1);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] result = new int[13][13];
				result = multiTable(12,12);
				
				for (int r=0;r<result.length;r++){
					for (int c =0;c<result[r].length;c++){
						System.out.print("\t"+result[r][c]);
					}
					System.out.println();
				}
		
		
	}

}
