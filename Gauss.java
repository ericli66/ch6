public class infinite{
	
	public static void main(String[] args) {
		double a = 6.0;
		System.out.println(gauss(2, 1000));
	}

	public static double gauss(double x, double n) {
		double sum = 0;
		double term = 1;
		
		for(int i = 0; i < n; i++) {
			sum = sum + term;
			term = term * (-x * x) / (i + 1);
		}
		
		return sum;
	}
}
