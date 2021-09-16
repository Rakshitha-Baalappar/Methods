package com.xworkz.Methods;

public class EvenNumbers {
	public static int[] arr() {
		int numbers[] = { 110, 111, 114, 117, 100, 111, 127, 129, 188, 190 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		int a[] = EvenNumbers.arr();
		System.out.println(a);
	}

}
