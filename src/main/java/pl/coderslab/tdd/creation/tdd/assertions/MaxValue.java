
package pl.coderslab.tdd.creation.tdd.assertions;

public class MaxValue {

	public static void main(String[] args) {
		int [] lista = {300,1,2,7,150,3,5,8,10};
		System.out.println(largest(lista));
	}

	public static int largest(int[] list) {

		if (list.length == 0) {
			throw new RuntimeException("Lista jest pusta");
		}
		int max = 0;
		for (int index = 0; index < list.length; index++) {
			if (list[index] > max) {
				max = list[index];
			}
		}
		return max;
	}

}