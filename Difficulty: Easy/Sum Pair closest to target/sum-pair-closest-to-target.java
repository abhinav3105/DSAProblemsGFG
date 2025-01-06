//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
         int first=0,second=0;
        int d=Integer.MAX_VALUE;
        
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);
        
        while(i<j)
        {
            int sum=arr[i]+arr[j];
            if(Math.abs(sum-target)<d)
            {
                d=Math.abs(sum-target);
                first=arr[i];
                second=arr[j];
                // first=Math.min(arr[i],arr[j]);
                // second=Math.max(arr[i],arr[j]);
            }
            if(sum<target)
                i++;
            else
                j--;
        }
        ArrayList <Integer> al= new ArrayList<>();
        if(arr.length==1)
        return al;
       
        
        al.add(first);
        al.add(second);
        
        
        return al;
    
    }
}