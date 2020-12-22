class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0 )
            return 0;
     
        int cnt=0;
        boolean isBeforeEmptyChar=true;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
            {
                cnt++;
                isBeforeEmptyChar=false;
            }
            else if(!isBeforeEmptyChar){
                break;
            }
        }
        return cnt;
    }
}

/* Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0 */