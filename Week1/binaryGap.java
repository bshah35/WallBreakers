/**
Covert integer to Binary

Start with two pointers and set them to end of String length

Move pointer 1 till it reaches '1' and then set p2 to p1. (only happens if p2 is at the end of string length)

Now move pointer 2 till it reaches '1'. Subtract diffrence of length of two pointers.
Get the max dist.
Set p1 to p2
repeat

Language: Java
Time Complexity: O(n)
Space Complexity: O(n)

Runtime: 1 ms, faster than 52.89% of Java online submissions for Binary Gap.
Memory Usage: 33.5 MB, less than 20.40% of Java online submissions for Binary Gap.
**/


   public int binaryGap(int N) {
       String s = Integer.toBinaryString(N);

        int p1 = s.length()-1, p2 = s.length()-1;
        int max = 0;
        while(p1 >= 0 && p2 >= 0){

            if(s.charAt(p2) == '1' && s.charAt(p1) == '1') {
                max = Math.max(max, Math.abs(p2 - p1));
                p1 = p2;
                p2--;

            }
           else if(s.charAt(p1) == '1' && p2 == s.length()-1)
               p2 = p1;

            else if(s.charAt(p1) == '0')
                p1--;
            else
                p2--;

        }
        return  max;
    }