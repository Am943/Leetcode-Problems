class Solution {
  public boolean isPalindrome(int x) {
    String a = Integer.toString(x);
    int r = a.length() - 1;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != a.charAt(r)) {
        return false;
      }
      r--;
    }
    return true;
  }
}
