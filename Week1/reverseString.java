/**
Start from begining of the array and iterate half through.

Switch the elements left most position with right most postion and increment.

Language: Java
TIme complexity: O(n)
Space complexity: O(n)

Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
Memory Usage: 48.7 MB, less than 79.75% of Java online submissions for Reverse String.
**/

  public void reverseString(char[] s) {
       // int p1 = 0, p2 = s.length-1;
        for(int i = 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length-(i+1)];
            s[s.length-(i+1)] = temp;
           
        }
        
         
    }