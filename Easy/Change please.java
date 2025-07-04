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
		    int x =sc.nextInt();
		    
		    int ans = 100-x;
		    int ans1=ans/10;
		    
		    if(x%10==0){
		        System.out.println(ans);
		    }
		    else{
		        System.out.println(ans1*10);
		    }
		}

	}
}
