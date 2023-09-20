#User function Template for python3

class Solution:
    def rotate(self, N, D):
        # code here
        # print("HArry")
        k=bin(N)[2:]
        n=len(k)
        k="0"*(16-n)+k
        # print(k)
        l=[0]*16
        r=[0]*16
        for i in range(16):
            l[(i+d)%16]=k[i]
            r[(i-d)%16]=k[i]
        r1=(int("".join(l),2))
        l1=(int("".join(r),2))
        return [l1,r1]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, d = input().strip().split(" ")
        n, d = int(n), int(d)
        ob = Solution()
        ans = ob.rotate(n, d)
        print(ans[0])
        print(ans[1])
# } Driver Code Ends