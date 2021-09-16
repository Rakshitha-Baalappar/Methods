package com.xworkz.Methods;

public class tollGate {
	public static void openGate() {
		System.out.println("Gate is opened");
	}

	public static void collectMoney() {
		System.out.println("Amount is paid");
	}

	public static void closeGate() {
		System.out.println("Gate closed");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to toll gate");
		tollGate.collectMoney();
		tollGate.openGate();
		System.out.println("Exit the gate");
		System.out.println("Happy journey");
		tollGate.closeGate();
	}

}
