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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int ans=a+b;
		    
		    if(ans%2!=0){
		        System.out.println("Alice");
		    }
		    else{
		        System.out.println("Bob");
		    }
		}

	}
}
