package classTest;

public class PolyAnimal {
	
	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		
		a[0] = new Animal(5, 15.5f);
		a[1] = new Elephant(3, 80f, "Elephant");
//		a[2] = new Dog(2, 10.3f, "female");
		
		for(int i=0; i<a.length; i++) {
			a[i].speak();
			System.out.println("===========");
		}
	}
	
	
	
	
}
