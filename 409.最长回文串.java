class Solution {
    public int longestPalindrome(String s) {
            int[] arr = new int[128];
            for (char c : s.toCharArray()) {
                arr[c]++;
            }
            int count = 0;
            for (int i : arr) {
                count += (i % 2);
            }
            return count == 0 ? s.length() : (s.length() - count + 1);
    }
}
  
