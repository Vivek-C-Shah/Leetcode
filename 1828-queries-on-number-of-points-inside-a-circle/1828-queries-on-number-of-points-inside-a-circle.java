class Solution {
    public static int[] countPoints(int[][] points, int[][] queries) {
    int[] count = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
        int xCenter = queries[i][0];
        int yCenter = queries[i][1];
        int radius = queries[i][2];
        count[i] = 0;

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            if (Math.pow(x - xCenter, 2) + Math.pow(y - yCenter, 2) <= Math.pow(radius, 2)) {
                count[i]++;
            }
        }
    }
    return count;
}
}