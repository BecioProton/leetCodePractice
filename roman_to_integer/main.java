class Solution {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for(int p1=s.length()-1;p1>=0;p1--){
            char ch = s.charAt(p1);
            switch(ch){
                case 'I':num = 1;
                break;
                case 'V':num = 5;
                break;
                case 'X':num = 10;
                break;
                case 'L':num = 50;
                break;
                case 'C':num = 100;
                break;
                case 'D':num = 500;
                break;
                case 'M':num = 1000;
                break;
            }
            if(4*num<ans)
            ans-=num;
            else
            ans+=num;
        }
        return ans;
    }
}