//Calorie Intake
//https://www.codechef.com/problems/CALINTAKE

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
	
		int eated=y*z;
		int rem=x-eated;
		
        if(eated>x)
	    {
	        System.out.println("-1");
	    }
	    else{
	        System.out.println(rem);
	    }
	}
}
