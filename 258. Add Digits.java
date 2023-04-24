class Solution {
    public int addDigits(int num) {
        int sum = num;
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        return sum;
    }
}	