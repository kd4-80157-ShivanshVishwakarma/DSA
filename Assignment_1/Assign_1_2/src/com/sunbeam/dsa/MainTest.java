package com.sunbeam.dsa;

public class MainTest {
	public static int linearSearch(Employee arr[],int key) {
		int cnt=0;
		for(int i=0;i<arr.length;++i) {
			cnt++;
			if(arr[i].getId()==key) {
//				System.out.println("Employee id is found at index : "+i);
				System.out.println("Employee name is found at index : "+i);
				break;
			}
			
		}
		return cnt;
	}
	
	/*public static int binarySearch(Employee arr[],double key) {
		int start=0;
		int end=arr.length-1;
		int mid=(end+start)/2;
		int cnt=0;
		
		while(start<=end) {
			cnt++;
			
			if(arr[mid].getSalary()==key) {
				System.out.println("Element found at index : "+mid);
				return cnt;
			}
			else if(arr[mid].getSalary()>key) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			mid=(end+start)/2;
		}
		return  cnt;
	}*/
	public static void main(String[] args) {
		Employee arr[]=new Employee[5];
		arr[0]=new Employee(1,"Hit",500);
		arr[1]=new Employee(3,"Wit",2000);
		arr[2]=new Employee(8,"Fit",7000);
		arr[3]=new Employee(9,"Kit",8000);
		arr[4]=new Employee(19,"Lit",9000);
//		int com = linearSearch(arr,"Kit");//by name
		int com = linearSearch(arr,9);//by id
//		int com = linearSearch(arr,8000);//by salary
//		System.out.println("Number of comparisions to find id : "+com);//by name
//		System.out.println("Number of comparisions to find name : "+com);//by id
//		System.out.println("Number of comparisions to find salary : "+com);//by salary
//		-----------------------------------------------------------
//		int com = binarySearch(arr,9);//by id
//		int com = binarySearch(arr,"Wit");//by name
//		int com = binarySearch(arr,9000);
//		System.out.println("Number of comparisions to find id : "+com);

	}

}
