//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            int result = ob.countSubstring(s);

            System.out.println(result);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    public int countSubstring(String s) {
        // code here
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int ans = 0;
        for (Character key : mp.keySet()) {
            if(mp.get(key) >1){
                int n = mp.get(key);
                ans = ans+ (n+1)*n/2;
            }
            else{
                ans+= mp.get(key);
            }
        }
        return ans;
    }
}