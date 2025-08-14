// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
     
     Stack<Character> stack=new Stack<>();
     HashSet<Character> set=new HashSet<>();
   
   String  s = "GEEKS FOR GEEKS";
//Output: "SKEGROF"



for(int i=s.length()-1;i>=0;i--)
{
    
    if(!set.contains(s.charAt(i)) && s.charAt(i)!=' ')
    {
        set.add(s.charAt(i));
        stack.push(s.charAt(i));
    }
}

   String result ="";
 for(int i=0;i<set.size();i++)
 {
     char last= stack.pop();
     result=last+result;
     
 }
 System.out.println(result);


      
    

     
    }
}
