class Solution {
       public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new int[]{};
       int left = 0;
       int right = matrix[0].length-1;
       int top = 0;
       int bottom = matrix.length-1;
       int cnt= 0;
       int[] res = new int[matrix.length * matrix[0].length];
       while(top <= bottom && left <= right){
           for(int i =left; i <= right; i++){
               res[cnt++] = matrix[top][i];
           }
           top++;
           for(int i = top; i <=bottom; i++){
               res[cnt++] = matrix[i][right];
           }
           right--;
           for(int i = right; i >= left&& top <= bottom; i--){
               res[cnt++] = matrix[bottom][i];
           }
            bottom--;
           for(int i = bottom; i >= top&& left <= right;i-- ){
               res[cnt++] = matrix[i][left];
           }
           left++;
       }
       return res;
    }
}
