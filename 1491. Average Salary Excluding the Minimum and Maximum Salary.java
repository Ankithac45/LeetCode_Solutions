class Solution {
    public double average(int[] salary) {
        int minSalary=salary[0];
        int maxSalary=salary[0];
        double sum=salary[0];

        for(int i=1;i<salary.length;i++){
            minSalary=Math.min(minSalary,salary[i]);
            maxSalary=Math.max(maxSalary,salary[i]);
            sum+=salary[i];
        }

        double average=(sum-minSalary-maxSalary)/(salary.length-2);
        return average;
    }
}