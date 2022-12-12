import java.util.Scanner;

public class millitaryservice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your name=");
        String str=s.nextLine();
        System.out.print("Enter your age=");
        int age=s.nextInt();
        System.out.print("Enter your gender=");
        char gender=s.next().charAt(0);
        if(age>=18){
            System.out.println("Enter your name="+str);
            System.out.println("Enter your age="+age);
            System.out.println("Enter your gender="+gender);
            System.out.println(str + " is "+ age + " years old and can go millitary ");
        }
        else{
            System.out.println(str +" is "+ age + " years old and can not go millitary ");
        }
    }

}
