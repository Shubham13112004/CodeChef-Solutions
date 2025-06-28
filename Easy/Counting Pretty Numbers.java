//Counting Pretty Numbers
//https://www.codechef.com/problems/NUM239?tab=statement

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
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    int count=0;
		    
		    for(int i=l;i<=r;i++){
		         
		        int s=i%10;
		        if(s==2||s==3||s==9){
		            count++;
		        }
		    }
		   System.out.println(count); 
		}

	}
}
