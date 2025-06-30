//RCB vs CSK
//https://www.codechef.com/problems/RCBCSK

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		int ans=x-y;
		
		if(ans>=18){
		    System.out.println("RCB");
		}else{
		    System.out.println("CSK");
		}

	}
}
