package p2;
public class OtherPackage
{
public OtherPackage()
{
p1.Protection p=new p1.Protection();
System.out.println("derived other package constructor");
// class or package only
// System.out.println("a = " +p.a);
// class only
// System.out.println("a_pri = "+p.a_pri);
System.out.println("a_pub = "+p.a_pub);
// class,subclass or package only
// System.out.println("a_pro = "+p.a_pro);
}
}