class Solution {
    public int integerBreak(int n) {
        if (n==2) return 1;
        if (n==3) return 2;
        if(n%3 == 0){
            return ( (int) Math.pow(3,n/3));
        }
        else if(n%3 == 1){
            return ( (int) Math.pow(3,(n/3 -1)) * 4);
        }
        else{
            return ( (int) Math.pow(3, n/3) * 2);
        }
    }
}