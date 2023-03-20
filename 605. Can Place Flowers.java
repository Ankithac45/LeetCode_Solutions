class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int i=1;
        if(flowerbed.length==1 && count!=n){
            if(flowerbed[0]==0){
                count++;
            }
        }
        if(flowerbed.length>1){
            if(flowerbed[0]==0 && flowerbed[1]==0 && count!=n){
                count++;
                flowerbed[0]=1;
            }
            if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0 &&count!=n){
                count++;
                flowerbed[flowerbed.length-1]=1;
            }
        }

        int prev=flowerbed[0];
        while(count!=n && i<flowerbed.length-1){
            if(flowerbed[i]==1){
                prev=flowerbed[i];
                i++;
            }else{
                if(prev==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                    count++;
                    flowerbed[i]=1;
                    prev=flowerbed[i];
                    i++;
                }else{
                    prev=flowerbed[i];
                    i++;
                }
            }
        }
        if(count==n){
            return true;
        }  
        return false;   
    }
}