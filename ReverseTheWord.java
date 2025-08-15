class Solution {
    public String reverseWords(String s) {
        // Code here
    
        String s1=s.replaceAll("\\.+",".");
        String s2=s1.replaceAll("^\\.||\\.$","");
        
        String s3[]=s2.split("\\.");
        

     StringBuilder sb = new StringBuilder();

       
       for(int i=s3.length-1;i>=0;i--)
       {
           sb.append(s3[i]);
           if(i!=0)
           {
               sb.append(".");
           }
           
       }
     
        

        return sb.toString();
    }
}
