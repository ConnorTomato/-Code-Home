class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = 0;
        int k = 0;
        int j = 0;
        int [] temp = new int[m+n];
        while(i!=m && j!=n){
            if(A[i] <= B[j]){
                temp[k++] = A[i++];
            }else{
                temp[k++] = B[j++];
            }
        }
        while(i!=m) 
                temp[k++] = A[i++];
        while(j!=n)
                temp[k++] = B[j++];
        for(int in = 0; in < temp.length; in++)
            A[in] = temp[in];
    }
}
