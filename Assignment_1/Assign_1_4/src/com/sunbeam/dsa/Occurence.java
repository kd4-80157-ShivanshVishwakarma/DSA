package com.sunbeam.dsa;
import java.util.Scanner;

public class Occurence {
	
	public static int occurence(int arr[],int key,int n) {
		int cnt=0;
		for(int i=0;i<arr.length;++i) {
			if(arr[i]==key) {
				cnt++;
				if(cnt==n) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1, 2, 3, -1, 2, 1, 0, 2, -1, 7, 8};
		System.out.println("Enter key : ");
		int key = sc.nextInt();
		System.out.println("Enter occurence : ");
		int nth=sc.nextInt();
        int occ=occurence(arr,key,nth);
        System.out.println(nth +" occurence of key "+key +" is at index : "+occ);
        
        
	}

}
