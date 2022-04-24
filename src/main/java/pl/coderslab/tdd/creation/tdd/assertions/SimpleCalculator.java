package pl.coderslab.tdd.creation.tdd.assertions;

public class SimpleCalculator {


	public static int add(int x, int y) {
		return x + y;
	}

	public int addPositve(int x, int y) {
		if (x <= 0 || y <= 0) {
			throw new IllegalArgumentException("Only positive");
		} else {
			return x + y;
		}
	}
}
