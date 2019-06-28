/**
Using a for loop iterate till the given int n.

1. Check if num%3 == 0 and i%5 == 0 if yes then add Fizzbuzz to list
2. Check else if if num%3 == 0  if yes then add Fizz to list
3. Check else if if num%5 == 0  if yes then add Buzz to list
4. else convert int to String and add to the list.

Language: Java
Time complexity: O(n) 
Space complexity: O(n)

Runtime: 1 ms, faster than 100.00% of Java online submissions for Fizz Buzz.
Memory Usage: 37 MB, less than 99.95% of Java online submissions for Fizz Buzz.
**/

public List<String> fizzBuzz(int n) {
        List<String> nums = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0)
                nums.add("FizzBuzz");
            
            else if(i%3 == 0)
                nums.add("Fizz");
            
            else if(i%5 == 0)
                nums.add("Buzz");
            
            else
                nums.add(Integer.toString(i));
        }
        
        return nums;
    }