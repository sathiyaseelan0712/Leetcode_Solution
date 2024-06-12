class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
    }
	public void swap(int[] nums, int start, int end){
        while(start<end){
        	nums[start] = nums[end]+nums[start]-(nums[end]=nums[start]);
            start++;end--;
        }
    }
}
