import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        int K = scanner.nextInt(); 

        int eliminatedPlayers = N - K;
        int prizePerPlayer = 10000;
        int totalPrize = eliminatedPlayers * prizePerPlayer;

        System.out.println(totalPrize);
	}
}
