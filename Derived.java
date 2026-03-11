package p1;
public class Derived extends Protection
{
public Derived()
{
System.out.println("base constructor");
System.out.println("a = " +a);
// class only
// System.out.println("a_pri = "+a_pri);
System.out.println("a_pub = "+a_pub);
System.out.println("a_pro = "+a_pro);
}
}