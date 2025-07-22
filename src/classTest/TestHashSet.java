package classTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		Set set = new HashSet();
		
		while(set.size()<6){
			int randomNum = (int)(Math.random()*49) + 1;
			set.add(randomNum);
		}
		
		Iterator objs = set.iterator();
		while(objs.hasNext()) {
			System.out.print(objs.next() + " ");
		}
		
	}
	
}
