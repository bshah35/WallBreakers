/**
Iterate through the entire length array A.

for the inner array A go in reverse and xor each digit with 1 and put that number in the new array.
We need a temp var k starting at 0 for the new array so it doesn't put it the digit at the end (arr[0][2])

For example: [[1,1,0]]
i = 0
 j = A[0].length-1
 A[i][j] = 0
 0 ^ 1 = 1
 arr[0][0] = 1
 
 Language: Java
 Time complexity = O(n)^2     - 0 ms 100%
 Space complexity = O(n)       - 36.6 MB 99.93%
**/

  public int[][] flipAndInvertImage(int[][] A) {
        int[][] arr = new int[A[0].length][A.length];
        for(int i = 0; i < A.length; i++){
            int k = 0;
             for(int j = A[0].length-1; j >= 0; j--){
               A[i][j]^=1;
               arr[i][k] = A[i][j];
               k++;
        }
    } 
        return arr;
        