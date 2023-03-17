package com.stream;

public class InplaceSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,0,3,12,0,24};
		//expected arr = 1,3,12,0,0,0
		int index=0;
		int temp=0;;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp=arr[index];
				arr[index]=arr[i]; 
				arr[i]=temp;
				index++;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
