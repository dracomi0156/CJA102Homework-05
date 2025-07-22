package hw_ext_1_1;

public class TestPen {
	public static void main(String[] args) {

		Pen p[] = new Pen[2];

		p[0] = new Pencil("Pentel", 150);
		p[1] = new InkBrush("unknown", 100);

		for (int i = 0; i < p.length; i++) {
			p[i].write();
			System.out.println(p[i].getPrice());
			System.out.println("===========");
		}

	}

}
