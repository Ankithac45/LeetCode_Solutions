class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> dict = new HashMap<>();
        String[] str=s.split(" ");

        if(str.length!=pattern.length()){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            if(dict.containsKey(pattern.charAt(i))){
                if(!dict.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }else{
                if(dict.containsValue(str[i])){
                    return false;
                }
                dict.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}
