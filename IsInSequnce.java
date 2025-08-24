// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
 
        String s="abc";
        String t="aebdc";
        int j=0;
        int i=0;
       
       
       while(i<t.length() && j<s.length())
       {
           
           if(s.charAt(j)==t.charAt(i))
           
           {
               i++;
               j++;
           }else{
               
               i++;
           }
       }
       if(j==s.length())
       {
           System.out.println("Is sequence");
       }else{
           System.out.println("not in sequence");
       }
    
 
 
       }
}
