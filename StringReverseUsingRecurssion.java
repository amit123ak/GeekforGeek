// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        String s="amit";
        String s1="kumar";
        
        char ch[]=s.toCharArray();
        int r= ch.length-1;
        int l=0;
        reverse(ch,0,r);
        
                System.out.println(new String(ch)); // prints "tima"

        
        
 
       }
       
       public static void reverse(char ch[],int l,int r)
       {
           if(l>=r)
           {
               return;
           }
           
        
   
               char temp= ch[l];
              ch[l]=ch[r];
              ch[r]=temp;
       
           
           reverse(ch, l+1,r-1);
           
       }
       
       
    }
