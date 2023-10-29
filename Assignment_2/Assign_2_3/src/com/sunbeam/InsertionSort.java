package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {
	
	public static int insertionSort(int arr[]) {
		
		int cnt=0;
		for(int i=1;i<arr.length;++i) {
			int temp=arr[i];//backup variable
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				cnt++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int arr[]={10,33,44,45,22,11};
		int com=insertionSort(arr);
		System.out.println("Comparisions : "+com);
		System.out.println("Insertion sorting : "+Arrays.toString(arr));
		
	}

}
