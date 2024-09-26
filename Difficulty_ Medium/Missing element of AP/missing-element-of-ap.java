//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMissing(int[] arr) {
        // code here
        int d;
        
        // //if(d1 = )
        int n = arr.length;
        // int sum = 0;
        // int a = arr[0];
        // for(int i = 0; i<n-1;i++) sum+=arr[i];
        if(n==2){
            int sum = arr[0]+arr[1];
            return sum/2;
        }
        int d1 = arr[1] - arr[0];
        int d2 = arr[2] - arr[1];
        if(d1<d2) d = d1;
        else d = d2;
        // int s = n*(2*a + (n - 1) * d)/2;
        // return s - sum;
        for(int i = 1;i<n;i++){
            if(arr[i]-arr[i-1]!=d){
                return arr[i]-d;
            }
        }
        return 0;
    }
}
