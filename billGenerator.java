package com.xworkz.Methods;

public class billGenerator {
	public static int calculateBillAmount(int price, int quantity) {
		int totalBillAmount = price * quantity;
		return totalBillAmount;
	}

	public static void main(String[] args) {

		int price = 500;
		int quantity = 5;
		int totalAmount;
		totalAmount = billGenerator.calculateBillAmount(price, quantity);

		System.out.println(totalAmount);
	}

}
