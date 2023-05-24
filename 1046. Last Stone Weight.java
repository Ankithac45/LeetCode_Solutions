class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        
        while (n > 1) {
            Arrays.sort(stones);
            int heaviest = stones[n - 1];
            int secondHeaviest = stones[n - 2];
            
            if (heaviest == secondHeaviest) {
                n -= 2;
            } else {
                stones[n - 2] = heaviest - secondHeaviest;
                n--;
            }
        }
        
        if (n == 1) {
            return stones[0];
        } else {
            return 0;
        }
    }
}