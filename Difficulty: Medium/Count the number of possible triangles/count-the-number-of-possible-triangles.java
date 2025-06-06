//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countTriangles(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    static int countTriangles(int arr[]){

        Arrays.sort(arr);
        int count = 0 , i = arr.length-1;
        while(i>1){
            int st=0;
            int end=i-1;
            while(st<end){
                if(arr[st]+arr[end]>arr[i]){
                    count+=(end-st);
                    end--;
                }
                else{
                
                    st++;
                }
            }
            i--;
        }
        return count;
    }
}