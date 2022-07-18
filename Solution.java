class Solution {
    public int lengthOfLongestSubstring(String s) { 
        int lens[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            //refer 1 for one alphabet reference
            int tmp = 1;
            String tmpS = "";
            tmpS += s.charAt(i);
            for(int j = i + 1; j < s.length(); j++)
            {
                
                if(tmpS.contains(Character.toString(s.charAt(j))))
                    break;
                else
                {
                    tmp++;
                    tmpS +=s.charAt(j);
                }
            }
            lens[i] = tmp;
        }
        int retVal = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(retVal < lens[i])
                retVal = lens[i];
        }
        return retVal;
    }
}