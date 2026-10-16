public class squareRoot{
	
	public static void main(String[] args) {
		double a = 6.0;
		System.out.println(squareroot(a));
	}

	public static double squareroot(double a) {
		double x = a / 2;
		double newX = (x + a / x) /2;
		
		while (Math.abs(newX - x) >= 0.0001) {
			x = newX;
			newX = (x + a / x) /2;
		}
		
		return newX;
	}
}
