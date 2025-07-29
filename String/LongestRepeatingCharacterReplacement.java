class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] freq = new int[26];
        int maxWindow = 0;
        int maxfreq = 0;

        for(int right =0 ; right< s.length(); right++){
            freq[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq,freq[s.charAt(right)-'A']);

            int windowlen = right - left +1;

            if(windowlen - maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowlen = right - left +1;
            maxWindow = Math.max(maxWindow,windowlen);
        }
        return maxWindow;
        
    }
}
