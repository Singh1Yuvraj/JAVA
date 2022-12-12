import java.util.Scanner;

public class facter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 0;
        int i=1;
        if (a > 0)
        {
            while (i<=a) {
                if (a % i == 0) {
                    System.out.println(i);
                    sum = sum + i;
                }
                i++;
            }
        }
        System.out.println("sum of facter "+sum);
    }
}
