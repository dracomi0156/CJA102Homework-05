package hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class hw4_4 {
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共3 人!
	
	public static void main(String[] args) {
		System.out.print("請輸入要借的現金金額: ");
		Scanner sc = new Scanner(System.in);
		int borrowHowMuch = sc.nextInt();
		
		int[][] colleagueMoney = { 
				{25, 2500}, 
				{32, 800}, 
				{8, 500}, 
				{19, 1000}, 
				{27, 1200},
				{10, 5000}, 
				{11, 3000}, 
				{23, 100}
		};
		
		borrowMoneyFromWhom(colleagueMoney, borrowHowMuch);

	}

	public static void borrowMoneyFromWhom(int[][] peopleHaveMoney, int borrowHowMuch) {

		ArrayList<Integer> peopleHaveMoneyList = new ArrayList<>();

		if (borrowHowMuch > 0) {
			for (int i = 0; i < peopleHaveMoney.length; i++) {
				if (peopleHaveMoney[i][1] >= borrowHowMuch) {
					peopleHaveMoneyList.add(peopleHaveMoney[i][0]);
				}
			}

			if (peopleHaveMoneyList.size() > 0) {
				System.out.print("有錢可借的員工編號: ");
				for (int i = 0; i < peopleHaveMoneyList.size(); i++) {
					System.out.print(peopleHaveMoneyList.get(i) + " ");
				}
				System.out.print("共" + peopleHaveMoneyList.size() + "人!");
			} else {
				System.out.println("大家都沒$$");
			}
		} else if (borrowHowMuch == 0) {
			System.out.println("你看起來不缺$$");
		} else {
			System.out.println("想要給我多少$$都可以");
		}

	}
	
	

}
