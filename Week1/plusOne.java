/**
 Make temp var

Iterate through the loop in reverse order

1. if pointer i = 0 (at first element) and the element is equal to 9 and temp is > 0 (because that means a 1 was carried and temp is 1)
 then create a new length in the orginal array append 1 to begining of element.
 2. Else pointer i != 0 (at first element) and temp is > 0 (has a carry of 1) update temp by making it single digit and set the current element to 0.
 3. Otherwise and the current element + temp which is 1 to update the element.

Language: Java
Time complexity: O(n)
Space complexity: O(n)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
Memory Usage: 35 MB, less than 83.52% of Java online submissions for Plus One.
**/


public int[] plusOne(int[] digits) {
       int temp = 1;

        for(int i = digits.length-1; i >= 0; i--) {
            if (i == 0 && (digits[i]+1)%10 == 0 && temp > 0) {
                digits  = Arrays.copyOf(digits, digits.length + 1);
                digits[i] = 1;
                break;
            }
            else if ((digits[i]+1)%10 == 0 && temp > 0) {
                temp = (digits[i] + 1) / 10;
                digits[i] = 0;
            }
            else {
                digits[i] = digits[i] + temp;
                temp = digits[i]/10;
            }

        }
        return digits;
    }