//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        int rs = 0;
        int re = matrix.length -1;
        int cs = 0;
        int ce = matrix[0].length -1;
        int cnt = 0;
        int size = matrix.length * matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        while(cnt< size){
            for(int i = cs;cnt<size && i<=ce;i++){
               
                ans.add(matrix[rs][i]);
                cnt++;
                
            }
            rs++;
            
            for(int i = rs;cnt<size && i<=re;i++){
               
                ans.add(matrix[i][ce]);
                cnt++;
            }
            ce--;
         
            for(int i = ce;cnt<size && i>=cs;i--){
               
                ans.add(matrix[re][i]);
                cnt++;
            }
            re--;
      
            for(int i = re;cnt<size && i>=rs;i--){
             
                ans.add(matrix[i][cs]);
                cnt++;
            }
            cs++;
            
        }
        return ans;
    }
}
