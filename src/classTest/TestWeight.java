package classTest;

public class TestWeight {
	public static void main(String[] args) {
		WeightTool[] wt = new WeightTool[3];
		
		wt[0] = new Dog();
		wt[1] = new Plane();
		wt[2] = new Powder();
		
		for(int i=0; i<wt.length; i++) {
			wt[i].printWeightTool();
		}
	}

}
