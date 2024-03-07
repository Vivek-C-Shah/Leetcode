class Solution {
    public int uniquePaths(int m, int n) {
        m=m-1;
        n=n-1;
        double a = 1;
        for (int i = m; i > 0; i--) {
            a*= (double) (i + n) / i;
        }
        a = Math.round(a);
        return (int) a;
    }
}