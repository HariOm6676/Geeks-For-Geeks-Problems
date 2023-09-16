//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static long mod=1000000007;
    static long solve(int n ,int i,long[] dp)
    {
        
        if (i>n)
        return 0;
        if (n==i)
        return 1;
        if (dp[i]!=0)
        return dp[i];
        long a= solve(n,i+1,dp);
        long b= solve(n,i+2,dp);
        long c= solve(n,i+3,dp);
        // System.out.println(a+" "+b+" "+c);
        dp[i]=(a+b+c)%mod;
        return dp[i];
    }
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        long dp[]= new long[n+1];
        for (int i=0;i<dp.length;i++)
        dp[i]=0;
       return solve(n,0,dp);
        // add your code here
}
}


