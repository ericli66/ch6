import java.util.Scanner;

public class Binary{
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(convertToBinary(x));
	}
	
	public static String convertToBinary(int num) {
		String b= "";
		while(num > 0) {
			int r = num%2;
			num = num/2;
			b= r + b;
		}
		return b;
	}
}

