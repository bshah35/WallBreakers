/**
Convert Decimal to Binary and put into char array

Iterate through the array and if it is 1 change to 0 and vice versa

Convert array back to String and the String back to Decimal String and back to int


Language: Java

Runtime: 1 ms, faster than 33.90% of Java online submissions for Number Complement.

Memory Usage: 33.1 MB, less than 18.95% of Java online submissions for Number Complement.
**/

public int findComplement(int num) {
      char[] arr  = (Integer.toString(num,2)).toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '0')
                arr[i] = '1';
            else
                arr[i] = '0';

        }

        return Integer.parseInt(String.valueOf(arr),2);
    }