class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            ans[i]=0;
            if(nums[i]!=0){
                ans[k++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        
    }
}
