
class TheAverage {

	
	public static int Maximum(int x,int y,int z) {
			
			int max = 0;
			
			if (x > y && x> z) {
				max = x;}
			
			else if (y > x && y > z) {
				max = y;}
			
			else if (z > x && z > y) {
				max = z;}
			
			return max;
		}
	
	public static double Average(double a,double b,double c,double d) {
		double sum = a+b+c+d;
		double avg = sum/4;
		return avg;
	}

	public static void main(String[] args) {
		 System.out.print(TheAverage.Average(5, 7, 9, 3));
	}
}


