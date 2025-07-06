package classTest;

public class AnimalTest {
	public static void main(String[] args) {
		Animal member1 = new Animal(2, 5.0f);
//		Animal member2 = new Animal(5, 10.3f);
		member1.speak();
//		member2.speak();
		
		member1.setAge(8);
		System.out.println(member1.getAge());
		
		member1.setWeight(35.5f);
		System.out.println(member1.getWeight());
	}
	
	
	

}
