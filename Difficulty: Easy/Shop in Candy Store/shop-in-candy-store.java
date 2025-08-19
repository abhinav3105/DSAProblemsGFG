class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        ArrayList<Integer> ans = new ArrayList<>();
        int d = 0;
        int i = 0;
        int l =0;
        while(d<prices.length){
            l += prices[i];
            i++;
            d = d+1+k;
        }
        ans.add(l);
        d=0;
        i = prices.length-1;
        l = 0;
        while(d<prices.length){
            l += prices[i];
            i--;
            d = d+1+k;
        }
        ans.add(l);
        return ans;
    }
}
