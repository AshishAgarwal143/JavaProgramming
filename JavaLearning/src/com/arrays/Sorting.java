package com.arrays;

public class Sorting {

	public static int[] bubblesort(int a[]) {
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					tmp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = tmp;
				}
			}
		}
		return a;
	}

	public static int[] selectionSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}	
	
	public static int[] insertionSort(int[]a) {
		int tmp;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
		return a;
	}
	static void printarray(int a[]) {
		for (int i:a) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[] = { 1, 4, 6, 2, 3, 7, 8, 4, 9, 10, 5 };
		System.out.println("Array before Sorting: ");
		printarray(b);
		System.out.println();
		System.out.println("Array after sorting: ");
		// int x[] = Sorting.bubblesort(b);
		// printarray(x);
		int y[] = selectionSort(b);
		printarray(y);
		System.out.println();
		int z[]= insertionSort(b);
		printarray(z);
	}

}
