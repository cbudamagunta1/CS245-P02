package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search{

	public String searchName() {
		//return type of search
		return "linear";
	}

	public int search(int[] arr, int target) {
		//search algorithm
		
		for(int i=0; i<arr.length; i++) {
			if(target==arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
