class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes.
        // Numbers ending in 0 (except 0 itself) are not palindromes.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }

        // When length is odd, we can get rid of the middle digit by reversedNumber / 10
        return x == reversedNumber || x == reversedNumber / 10;
    }
}