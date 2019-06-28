/**
First split the string and put it in the array.

Make new StringBuilder and put element from array containing each word in the Builder.

For each word reverse each letter start position and end position. Iterate only half way through the String. 

Concanate the reverse word to the String and repeat.

Language: Java

Time complexity: O(n)^2
Space complexity: O(n)


Runtime: 55 ms, faster than 9.97% of Java online submissions for Reverse Words in a String III.

Memory Usage: 40.7 MB, less than 15.90% of Java online submissions for Reverse Words in a String III.
**/

  public String reverseWords(String s) {
       String s1 = "";
        String arr[] = s.split(" ");
        for(int i = 0; i <  arr.length; i++){
            StringBuilder str = new StringBuilder(arr[i]);
            for(int j = 0; j < arr[i].length()/2; j++){
                char temp = str.charAt(j);
                str.setCharAt(j,str.charAt(str.length()-(j+1)));
                str.setCharAt(str.length()-(j+1),temp);
            }
            s1 = s1 + (str.toString() + " ");
        }
        return s1.trim();
    }