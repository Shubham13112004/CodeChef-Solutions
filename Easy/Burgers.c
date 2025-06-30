//Burgers
//https://www.codechef.com/problems/BURGERS

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
		    int b=sc.nextInt();
		    
		    if(a==b){
		        System.out.println(a);
		    }
		    else if (a>b){
		        System.out.println(b);
		    }
		    else{
		        System.out.println(a);
		    }
		}

	}
}
