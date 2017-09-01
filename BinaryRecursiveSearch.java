package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search{

	public String searchName() {
		//return type of search
		return "binary-recursive";
	}
	
	//helper method
	public int search(int[] arr, int target) {
		//search algorithm
		int min = 0;
		int max = arr.length-1;
		
		return search(arr, target, min, max);
		
	}
	
	//recursive method
	public int search(int[] arr, int target, int min, int max) {
		int mid = (min+max)/2;
		
		//base case
		if(max<min) {
			return -1;
		}
		
		if(target==arr[mid]) {
			return mid;
		}
		
		//recursive case
		if(target<arr[mid]) {
			return search(arr, target, min, mid-1);
		}else {
			return search(arr, target, mid+1, max);
		}	
		
	}

}