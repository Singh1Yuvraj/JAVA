public class this1
{
String a= "Dinga";
public void m1()
{
    String s = "Dingi";
    String b=this.a;
    System.out.println(this.a);
    System.out.println(b);
}

    public static void main(String[] args) {
        this1 a = new this1();
        a.m1();
    }
}
