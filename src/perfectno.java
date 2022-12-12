import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        print(a);
    }

    public static void print(int n) {
        int sum = 0;
        for(int i=1;i<=n/2;i++){

            if(n%i==0){
                sum=sum+i;}}
                if(sum==n){
                    System.out.println(n+"is perfect number");
                }
                else{
                    System.out.println(n+"is not a perfect numberu");
                }

        }
    }

