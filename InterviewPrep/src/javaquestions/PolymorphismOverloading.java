package javaquestions;

public class PolymorphismOverloading {

	public static void test(String Subject) {
	}

	public static void test(int Marks) {
	}

	public static void test(char grade) {
	}

	// Complile time error

	class Adder {
		static int add(int a, int b) {
			return a + b;
		}

		static double add(int a, int b) {
			return a + b;
		}
	}

	class TestOverloading3 {
		public static void main(String[] args) {
			System.out.println(Adder.add(11, 11));// ambiguity

		}

	}

	void run() {
		System.out.println("Vehicle is running");
	}
}
