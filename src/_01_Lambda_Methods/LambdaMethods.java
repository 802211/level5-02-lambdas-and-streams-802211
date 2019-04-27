package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String back = "";
			for(int j = 0; j<s.length(); j++) {
				back = back + s.substring(s.length()-j-1, s.length()-j);
			} 
			System.out.println(back);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String m = "";
			for(int k = 0; k<s.length(); k++) {
				String part = s.substring(k, k+1);
				if(k%2 == 0) {
					m = m + part.toUpperCase();
				}
				else {
					m = m + part.toLowerCase();
				}
			}System.out.println(m);
		}, "mixedUpperLowerCase");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String period = "";
			for(int l = 0; l<s.length(); l++) {
				period = s.substring(l, l+1) + ".";
			} System.out.println(period);
		}, "...");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	printCustomMessage((s)->{
		String vowels = "";
		for(int n = 0; n<s.length(); n++) {
		String	letter = s.substring(n, n+1);
			if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
				
			}
			else {vowels = vowels + letter;}
		}
		System.out.println(vowels);
	}, "vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
