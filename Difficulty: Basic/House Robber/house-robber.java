// User function Template for Java

class Solution {
    static int maximizeMoney(int N, int K) {
        // code here
        if(N%2==0) return K*N/2;
        return K*(N/2+1);
    }
};