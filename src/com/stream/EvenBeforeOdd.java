package com.stream;

public class EvenBeforeOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		
//		//expected arr = 2,4,6,8,0,1,3,5,7,9
		int len = arr.length;
		int index = 0;
		int[] res = new int[len];
		for(int i=0;i<len;i++) {
			if(arr[i]%2==0) {
				res[index]=arr[i];
				index++;
			}
		}
		
		for(int i=0;i<len;i++) {
			if(arr[i]%2==1) {
				res[index]=arr[i];
				index++;
			}
		}
		
		for (int i : res) {
			System.out.print(i + " ");
		}
		
	}
}
