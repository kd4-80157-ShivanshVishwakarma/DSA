package com.sunbeam.dsa;

import java.util.Arrays;

public class SelectionS {
	
	public static int selectionSort(int arr[]) {
		int pass=0;
		int cnt=0;
		for(int i=0;i<arr.length-1;++i) {
			pass++;
			for(int j=i+1;j<arr.length;++j) {
				cnt++;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("no. of passes : "+pass);
		return cnt;
	}
	
	public static void main(String[] args) {
		int arr[]={32,34,564,23,9};
		int com=selectionSort(arr);
		System.out.println("comparisions : "+com);
		System.out.println("Sorted array : "+Arrays.toString(arr));

	}

}
