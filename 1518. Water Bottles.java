class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numExchange<=numBottles){
            int quotient=numBottles/numExchange;
            int remainder = numBottles%numExchange;
            count+=quotient;
            numBottles=quotient+remainder;
        }
        return count;
    }
}