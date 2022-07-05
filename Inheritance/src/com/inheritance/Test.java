package com.inheritance;

public class Test {

	public static void main(String[] args) {
//		Manager manager = new Manager(1, "John", "Travel", 1000000,
//				new String[] { "Flight Reservation", "Flight Check In" });
//		System.out.println(manager.id);
//		System.out.println(manager.name);
//		System.out.println(manager.dept);
//		System.out.println(manager.salary);
//		manager.work();

//		Developer developer = new Developer(2, "Farisy", "Travel", 22000, "Java");
//		System.out.println(developer.id);
//		System.out.println(developer.name);
//		System.out.println(developer.dept);
//		System.out.println(developer.salary);
//		developer.work();

		Tester tester = new Tester(3, "Arun", "Travel", 20000, new String[] { "Selenium", "Jenkins" });
		System.out.println(tester.id);
		System.out.println(tester.name);
		System.out.println(tester.dept);
		System.out.println(tester.salary);
		tester.work();
	}

}
