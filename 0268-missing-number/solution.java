class Solution {
    public int missingNumber(int[] nums) {
        int n=0;
        for(int i=1;i<=nums.length;i++)
            n+=i;
        for(int i=0;i<nums.length;i++)
            n-=nums[i];
        return n;
    }
}
