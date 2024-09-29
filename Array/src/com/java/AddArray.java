package com.java;

public class AddArray {
	public void PrintAddArray(int[][] arr, int[][] arrr) {
		int[][] ar = new int[arr.length][arr[0].length];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				ar[i][j] = arr[i][j] + arrr[i][j];
				System.out.print(ar[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
