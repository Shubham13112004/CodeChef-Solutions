import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
	   int	t = sc.nextInt();
		
		while(t-->0){
		    String arr = sc.next();
		    if(arr.equalsIgnoreCase("B")){
		        System.out.println("BattleShip");
		    }
		    else if(arr.equalsIgnoreCase("C")){
		        System.out.println("Cruiser");
		    }
		    else if(arr.equalsIgnoreCase("D")){
		        System.out.println("Destroyer");
		    }
		    else if(arr.equalsIgnoreCase("F")){
		        System.out.println("Frigate");
		    }
		}

	}
}
