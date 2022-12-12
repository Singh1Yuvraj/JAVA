import java.sql.SQLOutput;
import java.util.Scanner;

public class Usersum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        while(true){
        if(a<b){
            TheSum(a,b);
            break;
        }
        else{
            System.out.println("Enter the new numbers");
            a=s.nextInt();
            b=s.nextInt();
        }}
    }

    static void TheSum(int n,int m){
        int sum =n+m;
        System.out.println(sum);
    }
}
