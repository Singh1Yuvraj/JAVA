import java.util.Scanner;

public class largestinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[]={1,2,3,4,5,6,7,8};
        int max=print(A,0);
        System.out.println(max);
    }
    static int print(int []A, int i){
        if(A[i]==A.length){
            return A[i];
        }
        int min=print(A,i+1);
        if(min>A[i]){
            return min;
        }
        else{
            return A[i];
        }
    }
}
