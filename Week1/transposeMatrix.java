 
/**
Create an array with inner length being A[0] and outer length being the length of A
in order to get the length of tranpose matrix.

Iterate through the length of first inner array only since we are switching the row and column indices of the matrix. 

The algortihm work by jumping on each iteration through the inner array A[0].length times.

Example:
i = 0, j = 0
[[1,2],[4,5],[7,8]]
A[i][j]
arr[[1]]

i = 0, j = 1
A[j][i]
arr[[1,4]]


i = 0, j = 2
 A[j][i]
arr[[1,4,7]]

i = 1, j = 0
A[i][j]
arr[[1,4,7],[2]]

i = 1, j = 1
A[j][i]
arr[[1,4,7],[2,5]]


i = 1, j = 2
 A[j][i]
arr[[1,4,7],[2,5,7]]


Time complexity: O(n)^2
Space complexity: O(n)
**/
 public int[][] transpose(int[][] A) {
         int[][] arr = new int[A[0].length][A.length];
        
        for(int i = 0; i < A[0].length; i++){
          for(int j = 0; j < A.length; j++){
               arr[i][j] = A[j][i];
          }   
        }
        return arr;
    }
	