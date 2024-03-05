class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            sb.insert(0, c);
            columnNumber /= 26;
        }
        return sb.toString();
    }
}