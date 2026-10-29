class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        String[] words = (s1 + " " +s2).split(" ");
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);

        }
        for(String word : words){
            if(map.get(word)==1){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}