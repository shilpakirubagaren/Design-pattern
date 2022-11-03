import java.util.Scanner;
public class Solution {
	
    public static void main(String []arg)
    {
    	int i;
        String s;
        double d;
        Scanner scan = new Scanner(System.in);
         i = scan.nextInt();
         s=scan.next();
        d=scan.nextDouble();
        
    

        // Write your code here.
     String sc=String.valueOf(i); 
     System.out.println("String: " + sc);
        
      System.out.println("Double: " + d);
       int number = Integer.parseInt(sc);  
        System.out.println("Int: " + number );

  
}
}