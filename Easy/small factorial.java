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
		    long ans = 1;
		    int n=sc.nextInt();
		    for(int i=2;i<=n;i++){
		       ans=ans*i;
		    }
		    System.out.println(ans);
		}

	}
}
