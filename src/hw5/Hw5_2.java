package hw5;

public class Hw5_2 {
//	請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public static void main(String[] args) {

		randAvg();
	}

	public static void randAvg() {
		int[] randomNums = new int[10];
		double sum = 0;
		System.out.println("本次亂數結果");
		for (int i = 0; i < 10; i++) {
			int randomNum = (int) (Math.random() * 100) + 1;
			randomNums[i] = randomNum;
			sum += randomNum;
			System.out.print(randomNum + " ");
		}

		double avg = sum / 10;
		System.out.println();
		System.out.print("Average: " + avg);
	}

}
