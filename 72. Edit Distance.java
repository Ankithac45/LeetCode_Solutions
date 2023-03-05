class Solution {
    public int minDistance(String word1, String word2) {
                //Intialize
        int p=word1.length();
        int q=word2.length();
        int [][]memo=new int[p+1][q+1];

        //Updating first row
        for(int i=1;i<=q;i++){
            memo[0][i]=i;
        }

        //Updating the first column
        for(int j=1;j<=p;j++){
            memo[j][0]=j;
        }

        //For remaning cells
        for(int i=1;i<=p;i++){
            for(int j=1;j<=q;j++){
                //Zero replacement
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    memo[i][j]=memo[i-1][j-1];
                }
                //For either of three operations
                else{
                    int insertion=memo[i][j-1];
                    int deletion= memo[i-1][j];
                    int replacement=memo[i-1][j-1];
                    memo[i][j]=Math.min(Math.min(insertion,deletion),replacement)+1;
                }
            }
        }
        return memo[p][q];
    }
}