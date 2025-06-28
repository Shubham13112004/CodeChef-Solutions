//Rearranging digits to get a multiple of 5
//https://www.codechef.com/problems/DIGARR?tab=statement

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
		    int n=sc.nextInt();
		    String str = sc.next();
		    
		   boolean found =false;
		   
		   for(int i=0;i<n;i++){
		       char search = str.charAt(i);
		       
		       if(search=='0' || search=='5'){
		          found=true;
		          break;
		       }
		   }
		   
		   if(found){
		       System.out.println("YES");
		   }
		   else{
		       System.out.println("NO");
		   }
		}

	}
}
