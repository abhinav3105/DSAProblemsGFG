//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] mat = new char[n][m];

            // Reading the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.next().charAt(0);
                }
            }

            String word = sc.next();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(mat, word);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited; 
    static public boolean backTrack(char[][] mat, int i , int j , String word , int index) {
        if(index == word.length()) return true; 
        if(i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || word.charAt(index) != mat[i][j] || visited[i][j] == true ) return false;
        
        visited[i][j] = true; 
        boolean ans =  
                   backTrack(mat , i + dx[0] , j + dy[0] , word , index + 1) ||
                   backTrack(mat , i + dx[1] , j + dy[1] , word , index + 1) ||
                   backTrack(mat , i + dx[2] , j + dy[2] , word , index + 1) ||
                   backTrack(mat , i + dx[3] , j + dy[3] , word , index + 1);

        visited[i][j] = false; 
        return ans;
    }
    
    
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int rows = mat.length;
        int cols = mat[0].length;
        visited = new boolean[rows][cols]; 
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                if(backTrack(mat , i , j , word , 0) == true) {
                    return true;
                }
            }
        }
        return false;
    }
} 