import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isArm(n)){
            System.out.println("Arm");
        }
        else{
            System.out.println("not arm");
        }
    }
    static boolean isArm(int a){
        int temp,d=0,l=0,s=0;
        temp=a;
        while (temp>0){
            temp=temp/10;
            d++;
        }
        temp=a;
        while(temp>0){
            l=temp%10;
            s+=(Math.pow(l,d));
            temp=temp/10;
        }
        if(a==s){
            return true;
        }
        else{
        return false;}
    } 
}
