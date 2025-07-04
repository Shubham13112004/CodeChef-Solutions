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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if((a*b)%c==0){
                System.out.println((a*b)+" "+c);
            }
            
             else if((b*c)%a==0){
                System.out.println((c*b)+" "+a);
            }
            
            else if((a*c)%b==0){
                System.out.println((a*c)+" "+b);
            }
            
             else{
                 System.out.println(-1);
             }
            
        }

	}
}
