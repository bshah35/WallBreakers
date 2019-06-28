 /**
 Iterate till the given integer.

Using math.pow function if the power of 2^i = to integer then return true, else if it exceeds it return false.

Language: Java

Time complexity: O(n)
Space complexity: O(1)


Runtime: 2 ms, faster than 98.94% of Java online submissions for Power of Two.
Memory Usage: 33.4 MB, less than 5.24% of Java online submissions for Power of Two.
 **/
 
 public boolean isPowerOfTwo(int n) {
         for(int i = 0; i < n; i++){
            if(Math.pow(2,i) == n)
                return true;
            else if(Math.pow(2,i) > n)
                break;
        }
        return false;
    }