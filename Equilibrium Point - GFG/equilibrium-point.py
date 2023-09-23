# User function Template for python3

class Solution:
    # Complete this function
    
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,A, N):
        # Your code here
        if N==1:
            return 1
        i=0
        j=N-1
        ls=0
        rs=0
        while i<=j:
            if ls<rs:
                ls+=A[i]
                i+=1
            else:
                rs+=A[j]
                j-=1    
                
            
            
            
            # print(ls,i,rs,j)
            if ls==rs and j==i:
                return i+1
        return -1



#{ 
 # Driver Code Starts
# Initial Template for Python 3

import math


def main():

    T = int(input())

    while(T > 0):

        N = int(input())

        A = [int(x) for x in input().strip().split()]
        ob=Solution()

        print(ob.equilibriumPoint(A, N))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends