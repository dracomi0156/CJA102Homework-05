package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//•請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)

//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
public class Hw8_1 {
	public static void main(String[] args) {

		List myList = new ArrayList();
		myList.add(new Integer(100));
		myList.add(new Double(3.14));
		myList.add(new Long(21L));
		myList.add(new Short("100"));
		myList.add(new Double(5.1));
		myList.add("Kitty");
		myList.add(new Integer(100));
		myList.add(new Object());
		myList.add("Snoopy");
		myList.add(new BigInteger("1000"));

		// 用Iterator
		System.out.print("Iterator: ");
		Iterator its = myList.iterator();
		while (its.hasNext()) {
			System.out.print(its.next() + "  ");
		}
		System.out.println();

		// 用for
		System.out.print("for: ");
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + "  ");
		}
		System.out.println();

		// 用forEach
		System.out.print("forEach: ");
		for (Object list : myList) {
			System.out.print(list + "  ");
		}
		System.out.println();

		Iterator its2 = myList.iterator();
		myList.removeIf(list -> !(list instanceof Number));

		System.out.print("移除非Number相關的物件: ");
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + "  ");
		}
	}

}
