// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
     
   
    String s="Geeks";
    int pos=3;
    char c='A';
    //output GeeAks;
    
    StringBuilder sb=new StringBuilder(s);
    sb.insert(pos,'A');
    System.out.println(sb.toString());
    
   String s2= s.substring(0,pos)+c+ s.substring(pos);
   
   System.out.println(s2);
    

     
    }
}
