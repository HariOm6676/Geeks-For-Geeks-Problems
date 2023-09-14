//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    int mod=1000000000+7;
    public int solve(int arr[],int n , int sum, int dp[][])
    {
       if (dp[n][sum]!=-1)
       return dp[n][sum];
       if (n==0 &&  sum>0)
       return 0;
       else if(n==1){
           if(sum==0){
               if (arr[0]==0)
               return 2;
               else
               return 1;
           }
           else{
               if(arr[0]==sum)
               return 1;
               else
               return 0;
           }
       }
       else if (n==0 && sum==0)
       return 1;
       int ans=solve(arr,n-1,sum,dp)%mod;
       if (arr[n-1]<=sum){
           ans+=solve(arr,n-1,sum-arr[n-1],dp);
           ans%=mod;
       }
      dp[n][sum]= ans;
      return ans;
       
    }
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int dp[][]= new int[n+1][sum+1];
	    for (int i=0;i<dp.length;i++)
	    {
	        for (int j=0;j<dp[0].length;j++)
	        {
	            dp[i][j]=-1;
	        }
	    }
	    return solve(arr,n ,sum,dp);
	   // System.out.println(p);
	   // return 4;
	} 
}