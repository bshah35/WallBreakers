/**
If the length of array is > 1

Then we know that every letter from begining must match the letters in the first element.

If they don't we simply jus return the String.

So we loop through the length of first element and in the second element we check to if the letter where the first pointer ppointer in first loop matches the letter in same position as the first element letter.

Ex:

["Flower", "Flow", "Flight"
if p1 = F then p1 in second loop = F

Languae: Java
Time Complexity: O(n)^2 Not 100% sure
Space complexity O(n)

Runtime: 1 ms, faster than 75.60% of Java online submissions for Longest Common Prefix.

Memory Usage: 35.9 MB, less than 99.81% of Java online submissions for Longest Common Prefix.
**/



  public String longestCommonPrefix(String[] strs) {
      if(strs.length == 0)
            return "";

        if(strs.length == 1 || strs[0].equals("")){
            return strs[0];
        }

        String s  = "";
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length()-1 < i || strs[0].charAt(i) != strs[j].charAt(i))
                        return s;
            }

            s += strs[0].charAt(i);

        }
        return s;
     }