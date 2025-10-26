// User function Template for Java

class Solution {

    public static long minSum(int arr[], int n) {
        // Your code goes here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        long a = 0;
        long b = 0;
        while(!pq.isEmpty()){
            long x  = (long)pq.poll();
            a = a*10+x;
            if(pq.isEmpty()) break;
            long y  = (long)pq.poll();
            b = b*10+y;
        }
        return a+b;
    }
}