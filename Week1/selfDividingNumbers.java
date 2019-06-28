 /**
 First create an array list called num.

Iterate through the range of numbers between left and right inclusive.

Called a helper method to go through each digit recursviely. 

use a mod operator to retrieve last digit and mod the orginal num by it. 

3 cases: 
1. if last digit is = 10 return - 1 meaning digit should not be included.
2. if orginal num mod last digit not equal to 10 return -1
3. if after removing all digits from orginal num = 0 then return 1,  meaning digit should  be included. 
Ex 1: 
 
 21%(21%10) = 21%2 
 21%2 != 0 return -1
 
 Ex 2:
 22%(22%10) = 22%2
21%2 == 0 yes

22/10 == 0 no

call recursion
remove last digit

2%2 == 0 yes
2/10 == 0 yes return 0

Language: Java

Time complexity: O(n)^n   Runtime: 1 ms, faster than 100.00%
Space Complexity: O(n)     Memory Usage: 33.9 MB, less than 48.53% 

 **/
 
 public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(recursion(i,i) == 0){
                nums.add(i);
            }
        }
        
        return nums;
        
    }
    
    
     private int recursion(int num,int i){
        if(i%10 == 0 || num%(i%10) != 0)
             return - 1;
        if(i/10 == 0)
            return 0;

        return recursion(num, i/10);
    }