package hw7;

import java.io.Serializable;

public class Dog implements Serializable, Pet {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
