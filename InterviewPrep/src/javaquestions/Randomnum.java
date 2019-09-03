package javaquestions;

import java.util.Arrays;

public class Randomnum {

	public static void main(String[] args) {

		String str = "codeinhub";

		// StringBuffer str1 = new StringBuffer();
		// System.err.println(str1.append(str).reverse());

		int Leng = str.length();
		System.out.println(Leng);

		for (int i = str.length(); i > 0; i--) {
			System.out.print(i);
		}

		String[] arr = { "Apple", "Mango", "Cherry", "Strawberry", "Berries" };

		Arrays.sort(arr);

		for (String string : arr) {
			System.out.println(string);
		}

	}

}
