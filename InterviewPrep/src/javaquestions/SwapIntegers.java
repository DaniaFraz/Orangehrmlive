package javaquestions;

import java.util.Arrays;

public class SwapIntegers {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 9;

		num1 = num1 * 3;
		System.out.println(num1);

		String s = "honda";
		String a = "Acord";

		a = s + a;
		System.out.println(a);

//		int division = num2 / 3;
//		System.out.println(division);

		// Alpha characters
		String Givenstr = "S09@@tr123ing353463";
		String Replc = Givenstr.replaceAll("[a-zA-Z]", "");
		String Replc1 = Givenstr.replaceAll("[0-9]", "");
		int subt = Givenstr.length() - Replc.length();
		int subt1 = Givenstr.length() - Replc1.length();
		System.out.println(subt);
		System.out.println(subt1);

		// odd number
		// int x;
//
//		for (int i = 2; i < ; i++) {
//			
//		
//			if (x == 3) {
//				System.out.println("Even");
//			} else {
//				System.out.println("Odd");
//			}	
//		}

		String str = "Code in hub";
		;
		System.out.println(str.substring(5));

		// Buffer Class
		int num = 1234567, reversed = 0;
		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		System.out.println("Reversed Number: " + reversed);

		String str1 = "addffdsh1234";
		StringBuffer str2 = new StringBuffer();
		System.out.println(str2.append(str1).reverse());

		// 6. Write a program to sort array in ascending order?

		String[] arr = { "Apple", "Mango", "Cherry", "Strawberry", "Berries" };

		Arrays.sort(arr);
		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

//	7.   How can you convert a String in to an array? Array to String?
		Arrays.toString(arr);

		String a = "English";
		String b = "Math";
		if (a != b) {
			System.out.println("Two strings are not equal to each other ");
		} else {
			System.out.println("Two strings are equal to each other");
		}

	}
}
