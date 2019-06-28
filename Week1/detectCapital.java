/**
Solution 1: Using regular experssion
word.matches("(([A-Z])([a-z]+))|([A-Z]+)|([a-z]+)");

Solution 2: 
Use ascii value and helper methods

Case 1: USA
If any value is greater than or equal to 97 'a' then return false

Case 2: Usa
If any value is < 97 'a' and first letter value < 97 'a' return false

Case 3:  usa

if any value < 97 'a' return false

Language: Java

Time complexity: O(n)

Space complexity: O(1)

Runtime: 1 ms, faster than 100.00% of Java online submissions for Detect Capital.
Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Detect Capital.
**/


public static boolean detectCapitalUse(String word) {
           if(word.length() == 0)
             return true;
        if(word.charAt(0) < 97 && word.charAt(word.length()-1) < 97)
            return isAllUpper(word);

        if(word.charAt(0) < 97 && word.charAt(word.length()-1) >= 97)
            return firstLetterUpper(word);

        else
            return isAllLower(word);

    }

    private static boolean isAllUpper(String word){
        for(int i = word.length()-1; i >= 0; i--){
            if(word.charAt(i) >= 97)
                return false;
        }
        return true;
    }

    private static boolean firstLetterUpper(String word){
        for(int i = word.length()-1; i >= 1; i--){
            if(word.charAt(0) < 97 && word.charAt(i) < 97)
                return false;
        }
        return true;
    }

    private static boolean isAllLower(String word){
        for(int i = word.length()-1; i >= 0; i--){
            if(word.charAt(i) < 97)
                return false;
        }
        return true;
      }