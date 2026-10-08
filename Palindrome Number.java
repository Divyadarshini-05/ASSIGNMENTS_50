class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // 1. Negative numbers are not palindromes (e.g., -121 becomes 121-).
        // 2. Numbers ending in 0 are not palindromes, unless the number itself is 0.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        // Reverse only the second half of the number to avoid integer overflow
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example, for 12321, at the end of the loop x = 12, revertedNumber = 123
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
