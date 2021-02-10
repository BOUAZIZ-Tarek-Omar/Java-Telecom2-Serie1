package ex3;
import ex3.Palindrome;
public class MainFunction {

	public static void main(String[] args) {
		String s="Et la marine va venir a Malte";

		Palindrome p = new Palindrome();
		System.out.println(p.palindrome(s));

	}

}
