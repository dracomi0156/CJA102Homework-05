package classTest;

public class Animal {
	private int age;
	private float weight;
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
		
		
	}
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}else {
			System.out.println("please confirm the age.");
		}
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public void setWeight(float weight) {
		if(weight > 0) {
			this.weight = weight;
		}else {
			System.out.println("please confirm the weight.");
		}
	}
	
	
	
	public void speak() {
		System.out.println("age: " + this.age);
		System.out.println("weight: " + this.weight);
	}
	
	
}
