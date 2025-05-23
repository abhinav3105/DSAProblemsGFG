class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int cnt = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            if(cnt>= count){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i) == ch){
                cnt++;
            }
            
        }
        return sb.toString();
    }
}