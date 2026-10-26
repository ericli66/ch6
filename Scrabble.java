
public class Scrabble{
	
	public static void main (String[] args) {
				System.out.println(canSpell("quijibo", "jbib"));
	}
	
	public static boolean canSpell(String str, String s) {
		for(int i = 0; i < s.length(); i++) {
			if(check(s.charAt(i), str) < check(s.charAt(i), s)) return false;
		}
		return true;
	}
	public static int check(char a, String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(a == str.charAt(i)) count++;
		}
		return count;
	}
}

