package com.xworkz.Methods;

public class LargeNumber {
	public static int max(int array[]) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int numbers[] = { 150, 102, 114, 150, 106, 198, 120, 193, 250, 140 };

		int largest = LargestNumber.max(numbers);
		System.out.println(largest);
	}

}

	
