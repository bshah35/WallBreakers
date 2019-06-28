/**
Make a HashSet and add all the Vowels.

Convert String to CharArray
Use start and end pointer
First compare and check if start pointer and pointer conatin vowels, if so switch them.
Else if start pointer conatins vowels only then decrement end pointer and vice versa for start pointer, increment it.

Language: Java

Time complexity: O(n)
Space complexity: O(n)

Runtime: 5 ms, faster than 56.01% of Java online submissions for Reverse Vowels of a String.
Memory Usage: 38.4 MB, less than 90.69% of Java online submissions for Reverse Vowels of a String.
**/


 public String reverseVowels(String s) {
         Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('a');
        set.add('E');
        set.add('e');
        set.add('I');
        set.add('i');
        set.add('O');
        set.add('o');
        set.add('U');
        set.add('u');
         int p1 = 0, p2 = s.length()-1;
         char[] a = s.toCharArray();
         while(p1 < p2){
             if(set.contains(a[p1]) && set.contains(a[p2])){
                 char temp = a[p1];
                 a[p1]= a[p2];
                 a[p2] = temp;
                 p1++;
                 p2--;
             }
            else if(set.contains(a[p1]))
                p2--;
            
             else if(set.contains(a[p2]))
                p1++;
            
            else{
                p1++;
                p2--;
                
            }
                
        }
        
        return String.valueOf(a);
    }