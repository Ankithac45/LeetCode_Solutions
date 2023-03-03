class Solution {
    public int compress(char[] chars) {
        int idx=0;
        char curr = chars[0];
        int count = 1;
        int n =chars.length;

        for(int i=1;i<n+1;i++){
            if(i==n){
                chars[idx++]=curr;
                // chars[idx]=curr;
                // idx=idx+1;
                if(count > 1){
                    String data = Integer.toString(count);
                    for(char ch: data.toCharArray()){
                        chars[idx++]=ch;
                    }
                }
                break;
            }else if(chars[i]==curr){
                count =count+1;
            }else{
                chars[idx++]=curr;
                if(count > 1){
                    String data = Integer.toString(count);
                    for(char ch: data.toCharArray()){
                        chars[idx++]=ch;
                    }
            }
            curr=chars[i];
            count =1;
        }
        }
        return idx;
    }
}