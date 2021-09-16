package com.xworkz.Methods;

public class AC {
	public static void on() {
		System.out.println("Ac is ON");
	}

	public static void off() {
		System.out.println("AC is OFF");
	}

	public static void tempIncr() {
		System.out.println(" Temparature is Increasing");
	}

	public static void tempDecr() {
		System.out.println(" Temparature is Decreasing");
	}

	public static void main(String[] args) {
		AC.on();
		AC.tempIncr();
		AC.tempDecr();
		AC.off();
	}



}
