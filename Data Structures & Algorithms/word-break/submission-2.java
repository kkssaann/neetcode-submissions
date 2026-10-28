class Solution {
    public boolean fun(String s, List<String> wordDict, HashMap<String,Boolean> map){
        if(s.length()==0){
            return true;
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        for(String word: wordDict){
            if(s.startsWith(word)){
                if(fun(s.substring(word.length()),wordDict,map)){
                    map.put(s,true);
                    return true;
                }
            }
        }
        map.put(s,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> map = new HashMap<>();
        return fun(s,wordDict,map);
    }
}
