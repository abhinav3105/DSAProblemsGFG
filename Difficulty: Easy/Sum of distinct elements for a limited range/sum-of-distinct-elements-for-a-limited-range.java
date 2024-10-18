//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int arr[] = new int[elements.length];

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.sumOfDistinct(arr));
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to calculate the sum of distinct elements in the array.
    public int sumOfDistinct(int[] arr) {
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
