// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseAnyWord {
    public static void main(String[] args) {
 

     String str="Amit kumar Gond";
     
     String st[]=str.split("\\s+");
     int pos=1;
   
     ReverseAnyword(st,pos);
     
     
     
       }
       
    public static void   ReverseAnyword(String st[],int pos)
       {
           StringBuilder sb =new StringBuilder();
           
           for(int i=0;i<st.length;i++)
           {
               if(i==pos)
               {
                 String p=st[pos];
                 for(int j=0;j<p.length();j++)
                 {
                     sb.append(p.charAt(p.length()-j-1));
                 }
               }else{
                   sb.append(st[i]);
               }
               
               
               sb.append(" ");
           }
           
           System.out.println(sb.toString().trim());
       }
}
