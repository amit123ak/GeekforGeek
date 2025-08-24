// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      String s= "abababa";
      String sub="aba" ;
      //→ Output: 3
        int count=0;
        for(int i=0;i<=s.length()-sub.length();i++)
        {
          
                if(s.substring(i,i+sub.length()).equals(sub))
                {
                    count++;
                   
                
           
                }
            
        }
        
        System.out.println(count);
 
 
       }
}
