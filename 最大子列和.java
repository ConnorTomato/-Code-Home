import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] A = new int [100];
        int n = in.nextInt();
        for(int i = 0; i<n; i++ )
            A[i] = in.nextInt();
        int result = MaxSubseqSum(A,n);
        System.out.println(result);
    }

    public  static int MaxSubseqSum(int[]A,int n ){
        int ThisSum = 0;
        int MaxSum = A[0]; /*最大值初始化*/

        for(int i = 0;i<n; i++){
            ThisSum += A[i];/*向右累加*/
            if(ThisSum > MaxSum)
                MaxSum = ThisSum;/*发现更大和则更新当前结果*/
            if(ThisSum < 0)/*当前子列和为负数*/
                ThisSum = 0;/*则不可能使后面的部分和增大，则抛弃*/
        }
        return MaxSum;
    }
}
