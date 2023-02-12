class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }

        for(char ch: t.toCharArray()){
            if(!map.containsKey(ch)) return false;
            else {
                if(map.get(ch)==1) map.remove(ch);
                else map.put(ch, map.get(ch)-1);
            }

        }
        return map.isEmpty();
    }
}

//Time: O(n+m), n, m = length of strings
//Space: O(1) since it will max. have 26 characters, maximum.