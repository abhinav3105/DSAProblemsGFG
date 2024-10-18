//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public static ArrayList<Integer> arrangeOddAndEven(int arr[]) {
        // write code here
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0) l1.add(arr[i]);
            else l2.add(arr[i]);
        }  
        int e = 0;
        int o = 0;
        for(int i = 0;i<arr.length;i++){
            if(i%2==0) { 
                if(e<l2.size()){
                    ans.add(l2.get(e));
                    e++;
                }
                else{
                    ans.add(l1.get(o));
                    o++;
                }
            }
            else{
                if(o<l1.size()){
                    ans.add(l1.get(o));
                    o++;
                }
                else{
                    ans.add(l2.get(e));
                    e++;
                }
            }
        }
        return ans;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
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
            ArrayList<Integer> ans;
            ans = obj.arrangeOddAndEven(arr);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends