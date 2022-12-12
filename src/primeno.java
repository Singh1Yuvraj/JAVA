import java.sql.SQLOutput;
import java.util.Scanner;

public class primeno {
    public static boolean print(int n,int i) {

        if(n<=2){
            return (n==2)?true:false;
        }
         if(n%i==0){
            return false;
        }
        if(i*i>0){
            return true;
        }
        return print(n,i+1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(print(n,2)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }



    }




}
