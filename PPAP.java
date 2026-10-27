import java.util.Scanner;

public class PPAP{
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("Uh ! " + read(str));
	}
	
	public static String read(String str) {
		String o1= "";
		String o2= "";
		int comma = str.indexOf(",");
		o1 = str.substring(9, comma);
		o2 = str.substring(comma + 11, str.length());
		o2 = o2.substring(0, 1).toUpperCase() + o2.substring(1);
		return o2 + " " + o1;
	}
}

