class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,maxOne=0,zerCo=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
                zerCo++;
            }
            while(zerCo > k)
            {
                if(nums[left]==0)
                {
                    zerCo--;
                }
                left++;
            }
            maxOne=Math.max(maxOne,right-left+1);
            right++;
        }
        return maxOne;
    }
}
