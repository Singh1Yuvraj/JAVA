import java.util.Scanner;

public class strongno1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int temp=a;
        int c=0;
        while(a!=0){
            int b=a%10;
             c=c+fact(b);
             a=a/10;
        }
        if(c==temp){
            System.out.println("no is strong number");
        }
        else{
            System.out.println("not a strong number");
        }

    }
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}
