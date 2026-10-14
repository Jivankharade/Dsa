class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch  = s.charAt(i);
            sb.append(ch);
             if(sb.length()>=part.length()&&sb.substring(sb.length()-part.length()).equals(part)){
            sb.delete(sb.length()-part.length(),sb.length());
        }
        }
        
       
        return sb.toString();
    }
}