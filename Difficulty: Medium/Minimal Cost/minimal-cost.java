//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    int f(int ind,int arr[], int k,int dp[]){
        
        if(ind==0)return 0;
        if(dp[ind]!=-1)return dp[ind];
        
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(ind-i>=0){
                int temp=Math.abs(arr[ind-i]-arr[ind])+f(ind-i,arr,k,dp);
                min=Math.min(temp,min);    
            }
            
        }
        return dp[ind]=min;
    }
    
    public int minimizeCost(int k, int arr[]) {
        int ind=arr.length-1;
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        int ans=f(ind,arr,k,dp);
        return ans;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends