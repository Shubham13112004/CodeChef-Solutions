//Recent Contest Problem
//https://www.codechef.com/problems/RECENTCONT?tab=statement

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
		    
		    int n = sc.nextInt();
		    int s=0;
		    int l=0;
		    
		 for(int i=0;i<n;i++){
		     String str=sc.next();
		    
		    if(str.equals("START38"))
		    {
		        s++;
		    }
		    else if(str.equals("LTIME108")){
		        l++;
		    }  
		   } 
		  System.out.println(s+" "+l);		    
	 }		    
 }
}
