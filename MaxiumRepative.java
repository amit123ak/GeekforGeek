// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
       String s= "aabbbbccddddd";
       
        // "d5"
        
       StringBuilder sb=new StringBuilder();
      int max=0;
      int index=0;
       for(int i=0;i<s.length()-1;i++)
       {
            String s2="";
            int count=1;
           while(i+1<s.length()&& s.charAt(i)==s.charAt(i+1))
           {
               i++;
               count++;
           }
           
          // s2=s2+s.charAt(i);
           if(count>max)
           {
               max= count;
               index=i;
               
           }
       
       }
       System.out.println(s.charAt(index)+""+max);
  }
}
