package classTest;


public class ConstructorTest{

    public static void main(String[] args) {

        S2 ss = new S2(5) ;

    }

}

class S1 {
	public S1() {
		System.out.print("隱形的super()");
	}
    public S1(int x) {
        System.out.print(x);

    }

}

class S2 extends S1 {

    public S2(int y) {
        System.out.print(y) ;

    }

}

