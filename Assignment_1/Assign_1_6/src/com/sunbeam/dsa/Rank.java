package com.sunbeam.dsa;

import java.util.Scanner;

public class Rank {
	
	public static int findRank(int arr[],int x) {
		int cnt=0;
		for(int i=0;i<arr.length;++i) {
			if(arr[i]<=x) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,15,3,4,4,1};
		System.out.println("Enter rank to be searched : ");
		int x=sc.nextInt();
		int c=findRank(arr,x);
		System.out.println("Rank is : "+c);
	}

}
