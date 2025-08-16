class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        
    
        
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
        
        }
        
        
        for(char ch:s.toCharArray())
        {
            if(map.get(ch)==1)
            {
                return ch;
            }
        }
        
        return '$';
        
    }
}
