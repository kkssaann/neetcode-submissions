class Solution {
    public boolean fun(String s, int i, int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return fun(s,i+1,j-1);
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0; i<s.length() ; i++){
            for(int j = i ; j<s.length(); j++){
                if(fun(s,i,j)){
                    String temp = s.substring(i,j+1);

                    if(temp.length()>ans.length()){
                        ans= temp;
                    }
                }
            }
        }
        return ans;
    }
}
