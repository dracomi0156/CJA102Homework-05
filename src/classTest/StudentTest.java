package classTest;

public class StudentTest {
	
	public static void main(String[] args) {
		Student tom = new Student();
		Student ron = new Student();
		
		tom.play(4);
		tom.study(3);
		tom.study(2);
		
		ron.play(6);
		ron.study(3);
		
		System.out.println("tom: " + tom.score);
		System.out.println("ron: " + ron.score);
	}

}
