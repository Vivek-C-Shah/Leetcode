class Solution {
  public boolean checkValidString(final String s) {
    int high = 0;
    int low = 0;

    for (final char c : s.toCharArray()) {
      if (c == '(') {
        low++;
        high++;
      } else if (c == ')') {
        low = Math.max(0, --low);
        high--;
      } else if (c == '*') {
        low = Math.max(0, --low);
        high++;
      }
      
      if (high < 0)
        return false;
    }

    return low == 0;
  }
}
