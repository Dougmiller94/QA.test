package com.qa.tutorial;

public class Runner {
	
	public static void main (String[]args) {
		Interraction hello = new Interraction ();
		System.out.println(hello.greeting() + "" + hello.insult());
	}
}

