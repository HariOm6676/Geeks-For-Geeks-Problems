# User function Template for python3

class Solution:
    # Complete this function
    
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,A, N):
        # Your code here
        s1=0
        s2=0
        i=0
        j=len(A)-1
        # if(j%2!=0):
        #     return -1
        while(i<j):
            if(s1<s2):
                s1+=A[i]
                i+=1
            else:
                s2+=A[j]
                j-=1
            # print(s1,s2)
        if(s1==s2):
            return i+1
        else:
            return -1
        # Your code here



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