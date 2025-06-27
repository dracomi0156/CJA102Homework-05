package classTest;

public class Student {
	int score = 90;
	
	public void play(int hours) {
		score = score - hours;
//		System.out.println("Score: "+ score);
	}
	
	public void study(int hours) {
		score = score + hours;
//		System.out.println("Score: "+ score);
	}
	
	public static void main(String[] args) {
		Student tom = new Student();
		Student ron = new Student();
		
		System.out.println("tom init: " + tom.score);
		System.out.println("ron init: " + ron.score);
		
		tom.play(4);
		tom.study(3);
		tom.study(2);
		
		ron.play(6);
		ron.study(3);
		
		System.out.println("tom: " + tom.score);
		System.out.println("ron: " + ron.score);
	}


}
