class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }
    public static int helper(int[] a, int tar, int s, int h){
        if(s>h) return -1;
        int i = s-(s-h)/2;
        if(a[i] == tar) return i;
        if(a[s]<= a[i]) { //sorted
            if(tar<a[i] && tar>=a[s]) h = i-1;
            else s=i+1;
        }
        else if((tar>=a[s] && tar>a[i])|| (tar<a[s] && tar<a[i])) {
            h = i - 1;
        }
        else s = i + 1;
        return helper(a, tar, s, h);
    }
}