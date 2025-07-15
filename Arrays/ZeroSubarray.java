class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, n =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) n++;
            else {
                cnt += (n * (n+1)/2);
                n=0;
            }

            
        }
        return cnt += (n*(n+1)/2);
        
    }
}
