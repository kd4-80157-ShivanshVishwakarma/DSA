package com.sunbeam.dsa;

import java.util.Arrays;

public class MainTest {
	public static void insertionSort(Employee arr[]) {
//		int cnt=0;
		for(int i=1;i<arr.length;++i) {
			Employee temp=arr[i];//backup variable
			int j=i-1;
			while(j>=0 && arr[j].getSalary()>temp.getSalary()) {
//				cnt++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		
		Employee arr[]=new Employee[5];
		arr[0]=new Employee(1,"Hit",500);
		arr[1]=new Employee(3,"Wit",2000);
		arr[2]=new Employee(8,"Fit",7000);
		arr[3]=new Employee(9,"Kit",3000);
		arr[4]=new Employee(19,"Lit",9000);
		
		insertionSort(arr);
		
		for(Employee e:arr) {
			System.out.println(e.toString());
		}
	}

}
