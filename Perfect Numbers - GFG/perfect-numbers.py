#User function Template for python3

class Solution:
    def isPerfectNumber(self, N):
        # code here 
        s=0
        if N==1:
            return 0
        k=int(N**(1/2))+1
        for i in range(2,k):
            if N%i==0:
                s+=i+N//i
        s+=1
        if s==N:
            return 1
        else:
            return 0

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        
        ob = Solution()
        print(ob.isPerfectNumber(N))
# } Driver Code Ends