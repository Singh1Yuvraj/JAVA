import java.util.Scanner;

public class powerofnumber {
    public static int print(int i,int n) {

        if (n == 0) {

            return 1;
        }
        return(i * print(i, n - 1));
    }
    public static void main(String[] args) {
        int i = 5 , n = 2;
        System.out.println(print(i,n));
    }
}
