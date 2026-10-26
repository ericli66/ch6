
public class Doubloon{
	
	public static void main (String[] args) {
		System.out.println(isDoubloon("papa"));
	}
	
	public static boolean isDoubloon(String str) {
		str = str.toLowerCase();
		if(str.length() < 2) return false;
		for(int i = 0; i < str.length(); i++) {
			if(count(str.charAt(i), str) != 2) return false;
		}
		return true;
	}
	public static int count(char a, String str) {
		int b = 0;
		for(int i = 0; i < str.length(); i++){
			if(a == str.charAt(i)) b++;
		}
		return b;
	}
}

