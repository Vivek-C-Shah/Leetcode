class Solution {
    public String intToRoman(int num) {
        String Roman = "";
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < storeInt.length; i++) {
            while (num >= storeInt[i]) {
                Roman += storeRoman[i];
                num -= storeInt[i];
            }
        }
        return Roman;
    }
}
