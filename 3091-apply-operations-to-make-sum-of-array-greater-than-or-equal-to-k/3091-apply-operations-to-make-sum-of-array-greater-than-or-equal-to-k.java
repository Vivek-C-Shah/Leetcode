import java.lang.Math;

class Solution {
    public int minOperations(int target) {
        if (target == 1) {
            return 0;
        }
        
        int minOps = Integer.MAX_VALUE;
        for (int i = 1; i <= (target / 2); i++) {
            int temp = (int) Math.ceil((double) target / i);
            int operations = (i - 1) + (temp - 1);
            minOps = Math.min(operations, minOps);
        }
        
        return minOps;
    }
}
