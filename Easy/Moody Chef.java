//Moody Chef
//https://www.codechef.com/problems/MOOCHEF?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] arr = new int[n];

            int currentHappiness = 0;
            int maxHappiness = 0;
            int minHappiness = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] >= l && arr[i] <= r) {
                    currentHappiness++;
                } else {
                    currentHappiness--;
                }

                maxHappiness = Math.max(maxHappiness, currentHappiness);
                minHappiness = Math.min(minHappiness, currentHappiness);
            }

            System.out.println(maxHappiness + " " + minHappiness);
        }
    }
}
