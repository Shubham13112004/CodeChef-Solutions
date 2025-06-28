//Chef and Lockout Draws
//https://www.codechef.com/problems/LOCKDRAW?tab=statement


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0){
		    int n=3;
		    int []arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    Arrays.sort(arr);

		    int result=arr[0]+arr[1];
		    
		    if(result==arr[2]){
		        System.out.println("YES");
		    }
		    else{
		       System.out.println("NO"); 
		    }
		}
	}
}
