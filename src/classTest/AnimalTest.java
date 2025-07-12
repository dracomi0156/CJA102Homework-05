package classTest;

public class AnimalTest {
	public static void main(String[] args) {
/*		Animal member1 = new Animal(2, 5.0f);
		Animal member2 = new Animal(5, 10.3f);
		member1.speak();
		member2.speak();
		
		member1.setAge(8);
		System.out.println(member1.getAge());
		
		member1.setWeight(35.5f);
		System.out.println(member1.getWeight());
		System.out.println("==============");
		*/
		
		Animal member3 = new Animal(3, 8.0f);
		member3.speak();
		System.out.println("--------------");
		
		Elephant e1 = new Elephant(8, 1200f, "大象");
		e1.speak();
		System.out.println("--------------");
		
//		Dog d1 = new Dog(6, 8.6f, "male");
//		d1.speak();
		
	}
	
}
