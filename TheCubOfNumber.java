import java.util.Scanner;

class TheCubOfNumber {
	public static void main(String[] args) {
		int i, n;
		//The easy way
		System.out.print("How many numbers do you want to know there cubes?; ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		for (i=1; i <= n; i++) {
			System.out.println("Cube: "+i+" is  = "+(Math.pow(i, 3)));
		}
		//The lesser easyer way
		System.out.print("How many numbers do you want to know their cubes?; ");
		n = in.nextInt();

		for (i=1; i <= n; i++) {
    		System.out.println("Cube: "+i+" is  = "+(i * i * i));
		}

	}
}
