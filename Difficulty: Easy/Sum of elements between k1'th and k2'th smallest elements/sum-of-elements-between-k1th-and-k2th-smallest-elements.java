// User function Template for Java

class Solution {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        // Your code goes here
        Arrays.sort(A);
        // long a = A[K1];
        // long b = A[K2];
        long ans = 0;
        for(int i = 0;i<N;i++){
            if(A[i]>A[(int)K1-1] && A[i]<A[(int)K2-1]){
                ans+=A[i];
            }
        }
        return ans;
    }
}
