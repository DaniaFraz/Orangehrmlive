package javaquestions;

import org.testng.annotations.Test;

public class Arrayques {

	@Test
	public void array() {

		for (int i = 0; i < 5; i++) {
			for (int k = 5; k >= 0; k--) {
				if (i == k)
					continue;
				System.out.println(i + " " + k);
			}
		}

	}

	public void reverse() {

		int num = 123456789;

		for (num = 8; num >= 1; num--) {
			System.out.println(num);
		}

	}
}