import java.util.Scanner;

public class sampleStringDeclaration {


	    
	    public static void Dec(String a, String b){
	    
	        if (a.charAt(0) > b.charAt(0)){
	                System.out.println("The First letter in the first string is bigger");
	        }
	        else {
	            System.out.println("The First letter in the second string is bigger");
	        }
	    }
	    
	       public static void title(String a,String b){
	        String ra = Character.toString(Character.toUpperCase(a.charAt(0)));
	         String rb = Character.toString(Character.toUpperCase(b.charAt(0)));
	         for(int i=1;i<a.length();i++){
	             ra+=a.charAt(i);
	            }
	         for(int i=1;i<b.length();i++){
	             rb+=b.charAt(i);
	         }
	        System.out.println(ra+" "+rb); 
	    }
	        

	        
	    
	    public static void main(String[] args) {
	        
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.nextLine();
	        String B=sc.nextLine();
			System.out.println("This program detect wich word it's letters comes first in the alphabit + how many letter in the two word combain.");
	        System.out.print("You've entered: ");
			title(A, B);
			Dec(A, B);
			System.out.print("/n \n Thay have "+String(A.length()+B.length())+" letters.");
	        sc.close();
	        

	    
	        
	    }
	}

