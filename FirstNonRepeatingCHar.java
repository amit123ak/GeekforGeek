// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        String s="geeksforgeeks";
        boolean found= false;
        for(int i=0;i<s.length();i++)
        {
            int count=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                found =true;
                count++;
                //.out.print(count);
            }
        }
        if(count==1)
        {
            System.out.println(s.charAt(i));
            return ;
        }
      
        }
        System.out.println(" find first non reapeating char ");
    }
}
