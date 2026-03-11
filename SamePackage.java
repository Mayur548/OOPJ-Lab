package p1;
public class SamePackage
{
public SamePackage()
{
Protection p=new Protection();
System.out.println("base constructor");
System.out.println("a = " +p.a);
// class only
// System.out.println("a_pri = "+p.a_pri);
System.out.println("a_pub = " +p.a_pub);
System.out.println("a_pro = " +p.a_pro);
}
}