
class Main {
    public static void main(String[] args) {
     
       String s="abcabcabcxyz";
     
  for (int len = 1; len <= s.length() / 2; len++) {
            String prefix = s.substring(0, len);
            int count = 0;
            int i = 0;

            // Count consecutive repeats of prefix
            while (i + len <= s.length() && s.substring(i, i + len).equals(prefix)) {
                count++;
                i += len;
               // System.out.println(prefix);
            }

            // If prefix repeats more than once
            if(count>1)
            {
            System.out.println(count+"["+prefix+"]"+s.substring(i));
            }
         
        }
  
     
       
  }
}
