package hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//• 請設計一個Train類別，並包含以下屬性：
//- 班次number，型別為int
//- 車種type，型別為String
//- 出發地start，型別為String
//- 目的地dest，型別為String
//- 票價price，型別為double
//
//• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
//- (202, "普悠瑪", "樹林", "花蓮", 400)
//- (1254, "區間", "屏東", "基隆", 700)
//- (118, "自強", "高雄", "台北", 500)
//- (1288, "區間", "新竹", "基隆", 400)
//- (122, "自強", "台中", "花蓮", 600)
//- (1222, "區間", "樹林", 七堵, 300)
//- (1254, "區間", "屏東", "基隆", 700)

//• 請寫一隻程式，能印出不重複的Train物件
//• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//• 承上，不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件
//• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

public class hw8_2 {
	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		// 印出不重複的Train物件 - HashSet
		System.out.println("不重複");
		Set<Train> trainSet1 = new HashSet<Train>();
		trainSet1.add(t1);
		trainSet1.add(t2);
		trainSet1.add(t3);
		trainSet1.add(t4);
		trainSet1.add(t5);
		trainSet1.add(t6);
		trainSet1.add(t7);

		Iterator<Train> ts1 = trainSet1.iterator();
		while (ts1.hasNext()) {
			ts1.next().printInfo();
		}
		System.out.println("-----------------------------------");

		// 以班次編號由大到小印出 - ArrayList
		System.out.println("編號由大到小");
		Train trainList[] = new Train[7];
		trainList[0] = t1;
		trainList[1] = t2;
		trainList[2] = t3;
		trainList[3] = t4;
		trainList[4] = t5;
		trainList[5] = t6;
		trainList[6] = t7;

		Arrays.sort(trainList);
		for (Train item : trainList) {
			item.printInfo();
		}
		System.out.println("-----------------------------------");

		// 以班次編號由大到小印出 + 不重覆 - TreeSet
		System.out.println("編號由大到小 + 不重覆");
		Set<Train> trainSet2 = new TreeSet<Train>();
		trainSet2.add(t1);
		trainSet2.add(t2);
		trainSet2.add(t3);
		trainSet2.add(t4);
		trainSet2.add(t5);
		trainSet2.add(t6);
		trainSet2.add(t7);

		Iterator<Train> ts2 = trainSet2.iterator();
		while (ts2.hasNext()) {
			ts2.next().printInfo();
		}
		System.out.println("-----------------------------------");

	}
}
