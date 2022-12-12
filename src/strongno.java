import java.util.Scanner;

public class strongno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        int c=0;
        int n=a;
        for(;a!=0; a=a/10){
           int b=a%10;
            c=c+fact(b);

        }
        if(c==n){
            System.out.println("strong number");
        }
        else{
            System.out.println("not a strong number");
        }
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
            f=f*i;
        return f;
    }
}
