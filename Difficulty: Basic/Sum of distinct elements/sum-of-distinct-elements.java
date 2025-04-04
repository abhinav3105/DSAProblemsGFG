//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int sum = arr[0];
        set.add(arr[0]);
        for(int i = 1;i<arr.length;i++){
            if(!set.contains(arr[i])){
                sum+=arr[i];
                set.add(arr[i]);
            }
        }
        return sum;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
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
            int res = obj.findSum(arr);

            System.out.println(res);

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends