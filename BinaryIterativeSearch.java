package edu.usfca.cs.cs245;


/*
 * The search() function is an implementation of the search algorithm. 
 * The searchName() function is a descriptive name of algorithm — “Binary Recursive,” 
 * for example. When running the code, you should provide three arguments. 
 * In order, these arguments are: the size of the array to fill, 
 * the number of searches to perform and the type of search algorithm to use. 
 * For example: 2500000 100000 binary-iterative
 * 
 */

public class BinaryIterativeSearch implements Practice2Search{

	public String searchName() {
		//return type of search
		return "binary-iterative";
	}

	public int search(int[] arr, int target) {
		// search algorithm
		int min = 0;
		int max = arr.length-1;
		int mid;
		
		while(min<=max) {
			mid = (min+max)/2;
			
			if(target==arr[mid]) {
				return mid;
			}
			if(target<arr[mid]) {
				max=mid-1;
			}else{
				min=mid+1;
			}
		}return -1;
		
	}

}