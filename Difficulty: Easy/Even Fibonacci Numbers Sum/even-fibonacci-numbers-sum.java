//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N =Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenFibSum(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long evenFibSum(long N){
        // code here
        if(N<2) return 0;
        long f = 0;
        long s = 1;
        long ans = 0;
        long sum = 0;
        while(ans<N){
            ans = s + f;
            if((ans%2 == 0) && ans<=N) sum+=ans;
            f = s;
            s = ans;
        }
        return sum;
    } 
};