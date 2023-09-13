#User function Template for python3

class Solution:
    def findLargest(self, N, S):
        # code here
        s=""
        if S==0 and N==1:
            return 0
        if S==0 and N>1:
            return -1
        d=S//9
        s+="9"*d
        # print(s)
        r=S%9
        if len(s)>N:
            return -1
        if len(s)==N :
            if r==0:
                return int(s)
            else:
                return -1
        
        s+=str(r)
        while len(s)!=N:
            s+="0"
        return int(s)
        
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N, S = [int(x) for x in input().split()]
        
        ob = Solution()
        print(ob.findLargest(N, S))
# } Driver Code Ends