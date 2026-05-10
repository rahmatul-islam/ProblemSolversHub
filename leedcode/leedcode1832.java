public class leedcode1832 {
    
}
class Solution {
    public static boolean checkIfPangram(String sentence) {

        char [] ans=sentence.toCharArray();
         boolean result;
        for(int i=0;i<ans.length;i++){
            if (ans[i]>='a' && ans[i]<='z') {
               result=true;
                
            }
            else{
                result=false;
            }

        }
        if (result==true) {
            
            
        }
        
        
    }
}
