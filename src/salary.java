import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Salary =s.nextInt();
        if(Salary>=300){
            Salary=Salary+(Salary/10);
            System.out.println(Salary);
        }
        else{
            System.out.println("no bonus");
        }
    }
}
