/**
Xor the x and Y and get the total and convert that into binary.

Run through the loop with total string length. Count all the 1's and store that into result.



Ex: "10100"
           "10" 
			xor		------
					10110
			
Language: Java

Time complexity: O(n)
Space complexity: O(n)

Runtime: 1 ms, faster than 24.54% of Java online submissions for Hamming Distance.

Memory Usage: 33.3 MB, less than 18.67% of Java online submissions for Hamming Distance
**/


 public int hammingDistance(int x, int y) {
        String x1 = Integer.toString(y^x,2);
      
        int result = 0;
        for(int i = 0; i < x1.length(); i++){
            if (x1.charAt(i) == '1')
              result++;
        }

       return  result;
    }