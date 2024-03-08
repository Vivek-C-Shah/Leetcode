class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int pro = 1;
        for (int i = 0; i < nums.length; i++) {
            pro = pro * nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                int temp = 1;
                for(int j = 0;j<nums.length;j++){
                    if(i!=j){
                        temp = temp*nums[j];
                    }
                }
                ans[i] = temp;   
            }else{
                ans[i] = pro/nums[i];
            }
        }
        return ans;
    }
}