class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            StringBuilder s = new StringBuilder(Integer.toString(i));
            boolean flag = true;
            while (!s.isEmpty()){
                if (s.charAt(0) == '0' || i%(s.charAt(0)-'0') != 0){
                    flag = false;
                    break;
                }
                s.deleteCharAt(0);
            }
            if (flag) lst.add(i);
        }
        return lst;
    }
}