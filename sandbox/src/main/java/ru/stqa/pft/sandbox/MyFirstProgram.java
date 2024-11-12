package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main (String[] args) {
		hello("world");
		hello("Varvara");
		System.out.println("She is " + age() + ".");
	}

	public static void hello(String somebody) {
		System.out.println("Hello," + somebody + "!");
	}

	public static int age() {
		int age = 28;
		return age;
	}
}
