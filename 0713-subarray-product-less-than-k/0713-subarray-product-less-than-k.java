class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int low = 0, high = 0, n = nums.length,prod = 1 , res = 0;
        for( ; high<n; high++){
            prod *= nums[high];
            for( ; prod>= k && low<=high; low++){
                prod /= nums[low];
            }
            res += (high-low+1);
        }
        return res;
    }
}