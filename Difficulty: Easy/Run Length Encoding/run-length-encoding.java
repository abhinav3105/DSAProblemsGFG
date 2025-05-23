class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder sb = new StringBuilder("");
        int cnt = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                sb.append(s.charAt(i-1));
                sb.append(cnt);
                cnt = 1;
            }
            else cnt++;
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(cnt);
        return sb.toString();
    }
}