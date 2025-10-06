// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        int cnt = 0;
        for(int i = 1;i<=n/2+1;i++){
            if(i*i>=n)break;
            cnt++;
        }
        return cnt;
    }
}