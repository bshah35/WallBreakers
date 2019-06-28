/**
Use Two pointers method

Start  (p1)pointer position = index[0]
End (p2)pointer position =  index[array.length-1]

Use mod operator to check even/odd

1. First check if p1 is even, yes the increment p1.
2. If p1 is not even then check if p2 is even, if yes then store p2 num in temp var. Switch p1 num with p2 num and increment p1 and decrement p2 at same time. 
3. if p2 is not even then decrement p2.
4. Keep looping until p1 is greater then p2

Time complexity: O(n)
Space complexity: O(n)

Ex: 
[3,1,2,4,7,13,10,15]
p1                    p2
[3,1,2,4,7,13,10,15]
p1                p2
[10,4,2,1,7,13,3,15]
      p1       p2
[10,4,2,1,7,13,3,15]
         p1 p2
[10,4,2,1,7,13,3,15]
         p1p2
**/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int p1 = 0, p2 = A.length-1;
        while(p1 < p2){    
            
            if(A[p1]%2 == 0)
                p1++;
                
            else if(A[p2]%2 == 0){
               int temp = A[p2];
               A[p2] = A[p1];
               A[p1] = temp;
               p1++;
               p2--;
            }
            
            else{
                p2--;
            }
        }
        
        return A;
    }
}