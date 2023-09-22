#User function Template for python3


class Solution:
    def find(self, arr, n, x):
        a=-1
        b=-1
        f=0
        for i in range(n):
            if(arr[i]==x and f==0):
                a=i
                f=1
            if(arr[i]==x):
                b=i
        return [a,b]
        # code here


#{ 
 # Driver Code Starts
t=int(input())
for _ in range(0,t):
    l=list(map(int,input().split()))
    n=l[0]
    x=l[1]
    arr=list(map(int,input().split()))
    ob = Solution()
    ans=ob.find(arr,n,x)
    print(*ans)
# } Driver Code Ends