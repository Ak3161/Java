

class Solution {
    public String removeConsecutiveCharacter(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            if(i < n-1 && s.charAt(i) == s.charAt(i+1)){
                continue;
            }   else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
        
    }
}
