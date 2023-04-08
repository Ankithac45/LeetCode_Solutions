class Solution {
    public void duplicateZeros(int[] arr) {
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==0){
                for(int j=arr.length-1;j>=i+2;j--){
                    arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i+=2;
            }else{
                i+=1;
            }
        }
    }
}