class Solution {
    public String makeGood(String s) {
        int endPosition = 0;
        char[] charArray = s.toCharArray();
        
        for (int currentPosition = 0; currentPosition < s.length(); currentPosition++) {
            if (endPosition > 0 && Math.abs(charArray[currentPosition] - charArray[endPosition - 1]) == 32) endPosition--;
                else {
                charArray[endPosition] = charArray[currentPosition];
                endPosition++;
            }
        }
        
        return new String(charArray).substring(0, endPosition);
    }
}