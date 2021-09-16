package com.xworkz.Methods;

public class Phonepay {
	// Amount transfer, MobileRecharge, ElectricityBill, WaterBill, DTH

		public static void transferMoney() {
			System.out.println("Money transfered successfully");
		}

		public static void rechargeMobile() {
			System.out.println("Mobile recharge successfull!");
		}

		public static void electricityBill() {
			System.out.println("Electricity bill paid successfully");
		}

		public static void rechargeDTH() {
			System.out.println("DTH recharge Done");
		}

		public static void main(String[] args) {

			System.out.println("Login into Phonepe");
			Phonepay.rechargeDTH();
			Phonepay.electricityBill();
			Phonepay.rechargeMobile();
			Phonepay.transferMoney();
			System.out.println("Log out Phonepe");
		}

	}

	
