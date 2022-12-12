import java.util.*;
public class average {
    public static void main(String[] args)
        {
            int n, count = 1;
            float  x, aver, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            n = sc.nextInt();
            while (count <= n)
            {
                System.out.println("Enter the "+count+" number?");

                ++count;
            }
            if(n<0){
            aver= sum/n;
            System.out.println("The Average is"+aver);}

    }
}
