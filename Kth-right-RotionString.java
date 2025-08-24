// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
 
     String s= "abcdef";
     //k=2 → Output: "cdefab"
     int k=2;
     int index=0;
     for(int i=0;i<k;i++)
     {
    
        s= s.substring(index+1)+s.charAt(index);
        
      }
     
     
            System.out.println(s);

 
 
       }
}
