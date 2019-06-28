/**
1. Replace all special chars and space with empty String
2. Convert the String to lower case
3. Start from index 0 and and index at String.length-1, compare the letters if they don't match return false;


Language: Java

Time complexity: O(n)
Space complexity: O(n)

Runtime: 22 ms, faster than 12.03% of Java online submissions for Valid Palindrome.
Memory Usage: 40 MB, less than 14.53% of Java online submissions for Valid Palindrome.
**/


 public static boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]+","");
        s = s.toLowerCase();
        for(int i = 0; i < s.length()/2; i++){
          if(s.charAt(i)!= s.charAt(s.length()-(i+1)))
              return false;
        }
        return true;
    }