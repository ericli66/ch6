import java.util.Scanner;

public class PigLatin{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(split(str));
    }

    public static String pigLatin(String str) {
		if(str.length()<3) return str;	
		String r = "";	
		for (int i = 1; i < str.length(); i++) {
			r += str.charAt(i);
		}
		r = r + str.charAt(0) + "ay";
		return r;
    }
    
    public static String split(String str){
		String r = "";
		while(str.indexOf(" ") != -1){
			int space = str.indexOf(" ");
			String word = str.substring(0, space);
			
			r = r + pigLatin(word) + " ";
			str = str.substring(space + 1);
		}
		r = r + pigLatin(str);
		return r;
	}
}
