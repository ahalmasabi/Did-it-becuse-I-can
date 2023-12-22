import java.util.Scanner;

public class SubstringCompairisons {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        
        for (int i = 0; i<=s.length()-k;i++){
           if ((s.substring(i, i+k).compareTo(smallest))<=0){
               smallest = s.substring(i, i+k); }
        }
        
        
        for (int i = 0; i<=s.length()-k;i++){
           if ((s.substring(i, i+k).compareTo(largest))>=0){
               largest = s.substring(i, i+k); }
        }
        
        return smallest +"\n"+ largest;
    } 

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Plesae enter the word that you want to compair it subStrings");
        String s = scan.next();
        System.out.println("How maeny charecters you want the substring have in compaired");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println("the smallest and largest substring are: \n"+getSmallestAndLargest(s, k));
	}

}
