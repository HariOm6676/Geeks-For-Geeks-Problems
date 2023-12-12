//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution1{
    static int solve(int i, int j, int arr[])
    {
        int m=Integer.MAX_VALUE;
        if(i==j)
        return 0;
        for (int k=i ; k<j; k++)
        {
        int c=solve(i,k,arr)+solve(k+1,j,arr)+arr[i-1]*arr[j]*arr[k];
        m=Math.min(c,m);
        }
        return m;
    }
     static int matrixMultiplication(int N, int arr[])
    {
        // code here
        return solve(1,arr.length-1,arr);
    }
}
class Solution{
    static int solve(int i, int j, int arr[], int[][] dp)
    {
        int m=Integer.MAX_VALUE;
        if(i==j)
        return 0;
        if(dp[i][j]!=0)
        return dp[i][j];
        for (int k=i ; k<j; k++)
        {
        int c=solve(i,k,arr,dp)+solve(k+1,j,arr,dp)+arr[i-1]*arr[j]*arr[k];
        m=Math.min(c,m);
        dp[i][j]=m;
        }
        return m;
    }
     static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int[][] dp= new int[N][N];
        return solve(1,arr.length-1,arr, dp);
    }
}