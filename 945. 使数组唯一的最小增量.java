class Solution {
    public int minIncrementForUnique(int[] A) {
        if(A.length <=1) 
            return 0;
        Arrays.sort(A);
        int move = 0;
         // 遍历数组，若当前元素小于等于它的前一个元素，则将其变为前一个数+1
        for(int i = 1; i < A.length; i++){
            if(A[i]<=A[i-1]){
                int pre =A[i];
                A[i] = A[i-1] +1;
                move += A[i]-pre;
            }
            }
            return move;
        }  
}
