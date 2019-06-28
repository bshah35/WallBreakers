/**
Go through the array and xor each number with the previous one. Initial num starts with zero.  Last num that is stored is going to yeild the result.

Language: Java

Time complexity: O(n)
Space complexity: O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
Memory Usage: 38.6 MB, less than 94.50% of Java online submissions for Single Number.
**/

public int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num ^= nums[i];
        }
    return num;
    }