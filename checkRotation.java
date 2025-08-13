// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class checkRotationMatch {
    public static void main(String[] args) {
        
        String s1="abcd";
        String s2="cdab";
        System.out.print(checkRotationMatch(s1,s2));
        
        
    }
    
  public static boolean  checkRotationMatch(String s1,String s2)
    {
        
         
        for(int i=0;i<s1.length();i++)
        {
            
            if(s1.equals(s2))
            {
                return true;
            }
            char last=s1.charAt(s1.length()-1);
           s1= last+s1.substring(0,s1.length()-1);
           System.out.println(s1);
            
        }
        
        return true;
    }
}
