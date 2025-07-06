package hw4;

public class hw4_6 {
//	• 班上有8位同學，他們進行了6次考試結果如下：
//	  請算出每位同學考最高分的次數
	public static void main(String[] args) {
		int[][] classScores1 = {
				{ 10,  35, 40,  100, 90, 85, 75, 70 }, 
				{ 37,  75, 77,  89,  64, 75, 70, 95 },
				{ 100, 70, 79,  90,  75, 70, 79, 90 }, 
				{ 77,  95, 70,  89,  60, 75, 85, 89 },
				{ 98,  70, 89,  90,  75, 90, 89, 90 },
				{ 90,  80, 100, 75,  50, 20, 99, 75 }
		};
		
		int[][] classScores2 = {
				{ 100, 35, 40,  100, 90, 85, 75, 70, 20 }, 
				{ 37,  75, 77,  89,  64, 95, 70, 95, 95 },
				{ 100, 70, 79,  90,  75, 70, 79, 90, 50 }, 
				{ 77,  95, 70,  89,  60, 75, 85, 89, 95 },
				{ 98,  70, 89,  90,  75, 90, 89, 90, 100 },
				{ 90,  80, 100, 75,  50, 20, 99, 75, 60 }
		};
 		
		highestScoreCount(classScores1);
		highestScoreCount(classScores2);
		
	}
	
	
	public static void highestScoreCount(int[][] array) {
		int[] count = new int[array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == findMaxNum(array[i])) {
					count[j]++;
				}
			}
		}

		for (int i = 0; i < array[0].length; i++) {
			System.out.print("第" + (i + 1) + "位: " + count[i] + "次 \n");
		}
		System.out.println("===========");
	}
	
	
	public static int findMaxNum(int[] array) {
		int maxNum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
		}
		return maxNum;
	}

}
