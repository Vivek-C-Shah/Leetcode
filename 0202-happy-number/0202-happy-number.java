class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        int sum;
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            sum = 0;
            while(n != 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}