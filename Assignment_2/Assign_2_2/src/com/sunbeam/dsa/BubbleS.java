package com.sunbeam.dsa;

import java.util.Arrays;

public class BubbleS {
	public static int bubbleSort(int arr[]) {
		int cnt=0;
		int flag;
		int n=arr.length;
		for(int i=1;i<n;++i) {
			flag=0;
			for(int j=0;j<n-i;++j) {
				cnt++;
				if(arr[j]>arr[j+1]) {
					flag=1;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==0) {
				break;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int arr[] = {32,34,564,23,9};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		int com=bubbleSort(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
		System.out.println("Comparisions : "+com);
	}

}
