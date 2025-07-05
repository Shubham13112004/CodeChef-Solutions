import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){
		    int a=sc.nextInt();
		    int x=sc.nextInt();
		    int b=sc.nextInt();
		    int y=sc.nextInt();
		    
		     if((double) a/x > (double) b/y){
		         System.out.println("ALICE");
		     }
		     else if((double) a/x < (double) b/y){
		         System.out.println("BOB");
		     }
		     else{
		         System.out.println("EQUAL");
		     }
		}

	}
}
