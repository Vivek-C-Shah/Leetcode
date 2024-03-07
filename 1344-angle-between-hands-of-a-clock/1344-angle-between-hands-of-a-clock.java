class Solution {
    public double angleClock(int hour, int minutes) {
        double h = hour%12;
        double m = minutes;
        double a = Math.abs((6*m) - ((30*h) + (m/2)));
        return (a > 180 ? 360-a : a);
    }
}