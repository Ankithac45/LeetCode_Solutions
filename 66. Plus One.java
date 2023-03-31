class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag=true;
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
        }else{
            for(int i=0;i<digits.length;i++){
                if(digits[i]!=9){
                    flag=false;
                }
            }
            if(flag==false){
                int i=digits.length-1;
                while(i>=0){
                    if(digits[i]==9){
                        digits[i]=0;
                        i--;
                    }else{
                        digits[i]+=1;
                        break;
                    }
                }
            }else{
                int[] array=new int[digits.length+1];
                array[0]=1;
                // for(int i=1;i<array.length;i++){
                //     array[i]=0;
                // }
                return array;      
            }
        }
        return digits;
    }
}