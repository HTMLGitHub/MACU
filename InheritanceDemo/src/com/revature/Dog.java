package com.revature;

// Dog inheriting properties and behaviors from Animal
// the keyword extends allows you to inherit from another class
public class Dog extends Animal { // You cannot extend multiple classes
	
	public String name;
	
	// This is the default no-args constructor that is implicitly provided by the compiler if no other constructors are provided
	// But we do provide another constructor below, so if we wanted this no-args constructor, we would need to put it in manually
	// like this
	public Dog() {
		super(); // It invokes the constructor in the Animal class
	}
	
	public Dog(String name) {
		// super() // There is an invisible super() inserted here
		this.name = name;
	}
	
	public void playFetch() {
		System.out.println(name + " is playing fetch!");
	}
	
}
