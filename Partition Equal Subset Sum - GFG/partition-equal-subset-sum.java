//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static Set <Integer> s= new HashSet<Integer>();
    // static List<Integer> s=new ArrayList<Integer>();
    static boolean ans=false;
    static boolean solve (int[] arr,int n,int i,int sum,boolean dp[])
    {
        if (i>=n)
        return false;
        if (sum<0)
        return false;
        if (sum==0)
        return true;
        if (dp[i]!=false)
        return true;
        boolean a=solve(arr,n,i+1,sum-arr[i],dp);
        boolean b=solve(arr,n,i+1,sum,dp);
       dp[i]=a||b;
        return dp[i];
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int tot=0;
        for (int i:arr)
        tot+=i;
        boolean dp[]= new boolean[N+1];
        if(tot%2!=0)
        return 0;
        if(solve(arr,N,0,tot/2,dp))
        return 1;
        else
        return 0;// System.out.println(s);
       
    }
}