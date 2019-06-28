/**
If Strings length don't match return false
Solution 1: Store all letters from one of the string and check in the other string if map contains it with the right length. In other words,
store char as key and the amount it repeats store that as the value. If it doesn't match then return false. 

Solution 2: Convert both strings to lowercase. Convert both to char arryas and sort it. Return if the two strings match.

Time complexity: O(nlogn)
Space Complexity: O(n)

Runtime: 9 ms, faster than 27.45% of Java online submissions for Valid Anagram.
Memory Usage: 37.3 MB, less than 85.44% of Java online submissions for Valid Anagram.

**/




public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s  = new String(chars);
        chars = t.toCharArray();
        Arrays.sort(chars);
        t  = new String(chars);
        return s.equals(t);
    }