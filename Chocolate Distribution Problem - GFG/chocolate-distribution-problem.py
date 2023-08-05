#User function Template for python3
class Solution:
   def findMinDiff(self, A,N,M):
        A.sort()
        i=0
        m=float('inf')
        j=M-1
        while(j<N):
            m=min(m,A[j]-A[i])
            j+=1
            i+=1
        return m


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        N = int(input())
        A = [int(x) for x in input().split()]
        M = int(input())


        solObj = Solution()

        print(solObj.findMinDiff(A,N,M))
# } Driver Code Ends