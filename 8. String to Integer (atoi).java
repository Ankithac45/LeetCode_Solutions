class Solution {
public:
    int myAtoi(string s) {
        bool flag = true;
        int i=0;
        int n = s.size();

        while(i<n && s[i]==' '){
            i++;
        }
        if (i < n && (s[i] == '-' || s[i] == '+')) {
            flag = (s[i] == '+'); // Set flag to true for '+', false for '-'
            i++;
        }

        int num = 0;
        while(i<n && isdigit(s[i])){
            int digit = s[i]-'0';

            if (num > INT_MAX / 10 || (num == INT_MAX / 10 && digit > INT_MAX % 10)) {
                return (flag) ? INT_MAX : INT_MIN;
            }

            num=num*10+digit;
            i++;
        }

    return (flag)? num:-num;        
    }
};