// https://leetcode.com/problems/sparse-matrix-multiplication/
class Solution {
    // tc -> m*n*A[0].length, sc-> m*n
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        
        for(int row=0; row<result.length; row++){
            
            for(int col = 0; col<result[0].length; col++){
                
                for(int i=0; i<A[0].length; i++){
                    
                    result[row][col] += A[row][i] * B[i][col];
                }
            }
        }
        
        return result;
    }
}

// Better Performance, switch the loops to consider sparse matrices
class Solution {
    // tc -> m*n*A[0].length, sc-> m*n
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        
        for(int row=0; row<result.length; row++){
            
            for(int i=0; i<A[0].length; i++){            
                
                if(A[row][i] !=0){
                
                    for(int col = 0; col<result[0].length; col++){        

                        result[row][col] += A[row][i] * B[i][col];
                    }
                }
            }
        }
        
        return result;
    }
}

// May be better to put another non zero condition in inner loop
class Solution {
    // tc -> m*n*A[0].length, sc-> m*n
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        
        for(int row=0; row<result.length; row++){
            
            for(int i=0; i<A[0].length; i++){            
                
                if(A[row][i] !=0){
                
                    for(int col = 0; col<result[0].length; col++){        

                        if(B[i][col] != 0)
                            result[row][col] += A[row][i] * B[i][col];
                    }
                }
            }
        }
        
        return result;
    }
}
