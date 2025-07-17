package hw6;

public class Calculator {

	public Calculator() {
	}

	public int powerXY(int x, int y) throws CalException {
		if (x == 0) {
			if (y == 0)
				throw new CalException("0的0次方沒有意義");
			return 0; // 0的任何次方=0
		} else if (y < 0) { // y為負值，運算結果不為整數
			throw new CalException("次方為負值，結果回傳不為整數");
		} else if (y == 0) {
			return 1; // 任何數的0次方=1
		} else {
			int result = 1;
			for (int i = 0; i < y; i++) {
				result = result * x;
			}
			return result;
		}
	}

}
