class Solution {
    public static int numberOfSteps(int n) {
        return (numOfStepsHelper(n, 0));
    }
    public static int numOfStepsHelper(int n, int steps){
        if(n==0) return steps;
        if(n%2 == 0) return numOfStepsHelper(n/2, ++steps);
        else return numOfStepsHelper(n-1, ++steps);
    }
}