class Main {
    public static void main(String[] args) {
 
    // String s= "abcdef";
     //k=2 → Output: "cdefab"
     String s="abcd";
     String b= "cdab";
     int k=2;
     int index=s.length()-1;
     for(int i=0;i<s.length();i++)
     {
    
        s= s.charAt(index)+s.substring(0,index);
        if(s.equals(b))
        {
            System.out.println("found");
            System.out.println(s);

            return;
        }

      }
     
     
           // System.out.println(s);

 
 
       }
}
