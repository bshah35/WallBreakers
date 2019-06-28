 /**
 If the length of String is greater than 1
Get ascii value of char-64 to get the actual value of the letter and add it to (var colNum26) since 26 is the highest value in alpahabet.

Otherwise  Get ascii value of char-64 if String has only one char.

Language: Java
Time complexity: O(n)
Space complexity: O(n)

Runtime: 1 ms, faster than 99.96% of Java online submissions for Excel Sheet Column Number.

Memory Usage: 36 MB, less than 84.77% of Java online submissions for Excel Sheet Column Number.
 **/
 
 public int titleToNumber(String s) {
       int colNum = 0;
       for(int i = 0; i < s.length(); i++){
             if(s.length() > 1)
                colNum =  colNum*26 + ((int)(s.charAt(i))-64);
             else
                 colNum =  colNum + ((int)(s.charAt(i))-64);
        }
        return colNum;
    }