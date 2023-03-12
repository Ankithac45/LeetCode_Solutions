class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> dic=new HashMap<>();
        //Stored the roman numerals with the corrsponding value pairs
        dic.put('I',1);
        dic.put('V',5);
        dic.put('X',10);
        dic.put('L',50);
        dic.put('C',100);
        dic.put('D',500);
        dic.put('M',1000);

        //store the value of last index of the string;
        int val=dic.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(dic.get(s.charAt(i))>=dic.get(s.charAt(i+1))){
                val=val+dic.get(s.charAt(i));
            }else{
                val=val-dic.get(s.charAt(i));                
            }
        }
        return val;
    }
}

