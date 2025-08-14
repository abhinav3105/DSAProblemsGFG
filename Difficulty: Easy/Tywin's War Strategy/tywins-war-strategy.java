class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int h[] = new int[arr.length];
        int ans= 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<k)
                h[i]= k-arr[i];
            else{
                if(arr[i]%k == 0) h[i] = 0;
                else h[i] = k-arr[i]%k;
            }
        }
        Arrays.sort(h);
        if(h.length%2!=0){
            for(int i = 0;i<h.length/2+1;i++){
                ans+=h[i];
            }
        }
        else{
            for(int i = 0;i<h.length/2;i++){
                ans+=h[i];
            }
        }
        
        return ans;
    }
}