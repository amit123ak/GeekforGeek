// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        String s="geeksforgeeks";
        int ch []=new int [256];
        
        for(int i=0;i<s.length();i++)
        {
            
            ch[s.charAt(i)-'a']++;
        }
        
          for(int i=0;i<s.length();i++)
        {
            
            if(ch[s.charAt(i)-'a']==1)
            {
                System.out.println(s.charAt(i));
                return ;
            }
        }


    }
}
