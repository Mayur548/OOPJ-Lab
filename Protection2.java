package p2;
public class Protection2 extends p1.Protection
{
public Protection2()
{
System.out.println("derived other package constructor");
// class or package only
// System.out.println("a = " +a);
// class only
// System.out.println("a_pri = "+a_pri);
System.out.println("a_pub = "+a_pub);
System.out.println("a_pro = "+a_pro);
}
}