class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> ans = new ArrayList<>();
        int temp = a;
        a = b;
        b = temp;
        ans.add(a);
        ans.add(b);
        return ans;
    }
}