package p1;
public class Protection
{
int a=1;
private int a_pri=2;
protected int a_pro=3;
public int a_pub=4;
public Protection()
{
System.out.println("base constructor");
System.out.println("a = " +a);
System.out.println("a_pri = "+a_pri);
System.out.println("a_pub = "+a_pub);
System.out.println("a_pro = "+a_pro);
}
}
