package com.xworkz.Methods;

import java.util.*;

public class mobile {
	// call, SMS, calender, apps
	public static void call() {
		System.out.println("Dad is callling you");
	}

	public static void sms() {
		System.out.println("Mom is callling you");
	}

	public static void calendar() {
		System.out.println(new Date());
	}

	public static void apps() {
		System.out.println("Dispalying app");
		System.out.println("Whatsapp,Youtube,Amazon,adda247");
	}

	public static void main(String[] args) {
		mobile.calendar();
		mobile.apps();
		mobile.sms();
		mobile.call();

	}

}
