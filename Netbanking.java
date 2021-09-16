package com.xworkz.Methods;

public class Netbanking {
	public static void available(String userName, String password) {
		String customerID = "Radha";
		String pwd = "987654321";

		if (customerID == userName && pwd == password) {
			System.out.println("Login successfull for Net Banking");
		} else {
			System.out.println("Invaid username and password");
		}
	}

	public static void main(String[] args) {

		Netbanking.available("Radha", "987654321");
	}

}
