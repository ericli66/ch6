import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		String r = "";
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		
		for (int i = 0; i < str.length(); i++) {
			if(!nonLetters.contains(str.substring(i, i + 1))) 
			r += str.charAt(i);
		}
        String reverse = "";
        for (int i = r.length()-1; i > -1; i--) {
            reverse += r.charAt(i);
        }
        if (r.equals(reverse)) return true;
        return false;
    }
}
