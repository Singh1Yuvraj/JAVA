import java .util.Scanner;
public class laststring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s1 = s.nextLine();
        lastString(s1);
    }

    static void lastString(String s) {
        s = s + " ";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                System.out.print(s.charAt(i - 1) + " ");
        }
        System.out.print(s.length()-1);
    }
}
