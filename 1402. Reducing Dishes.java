class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int count = 1;
        Arrays.sort(satisfaction);
        int n=satisfaction.length;
        int sum=0;
        int finalSum=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=satisfaction[j]*count;
                count++;
            }
            if(sum>finalSum){
                finalSum=sum;
            }
            count=1;
            sum=0;
        }

        return finalSum;
    }
}