//Maximum slams
//https://www.codechef.com/problems/MAXSLAM

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		
		int needed = 25-x;
		
		if(needed<=0){
		    System.out.println(0);
		}
		else{
		    
		    int ans=(needed+3)/4;
		    System.out.println(ans);
		}
		

	}
}
