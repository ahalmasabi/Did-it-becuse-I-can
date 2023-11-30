import java.util.Scanner;

public class BaiscMath {

	public static void main(String[] args) {
		add();
		mult();
		
	}
	
	public static void add() {
	
	    Scanner sc = new Scanner(System.in);       

        System.out.println("Enter a number add on it:");
        int a1 = sc.nextInt();
        System.out.println("Enter another number to add it on the preveus:");
        int b1 = sc.nextInt();
        System.out.println("The summation is "+ (a1+b1));
    	sc.close();

	}
	
	public static void mult() {
		
		Scanner sc = new Scanner(System.in);       

	    System.out.println("Enter a number to multiply it: ");
	    int a1 = sc.nextInt();
	    System.out.println("Enter the number that you want to multiply with it: ");
	    int b1 = sc.nextInt();
	    System.out.println("The product of the multiplication is: "+ (a1*b1));
	    sc.close();

	}
	
    public static void div() {
		
		Scanner sc = new Scanner(System.in);       

	    System.out.println("Enter a number to divide it: ");
	    int a1 = sc.nextInt();
	    System.out.println("Enter the number that you want to divide with: ");
	    int b1 = sc.nextInt();
	    System.out.println("The product of the division is: "+ (a1/b1));
		sc.close();
	    
	}
	
	

}
