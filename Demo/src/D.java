
public class D extends C{
	public void m1()
	{
		System.out.println("In m1() of C");
	}
	public void m2()
	{
		System.out.println("In m2() of C");
	}
	public static void main(String[]args) {
		D d=new D();
		C c1 =new C();
		C c=new D();//PolyMorphic Reference
		c.m1();
		((D) c).m2();//downcasting reference from Super to Sub
		
		System.out.println(d instanceof C);//true
		System.out.println(c1 instanceof C);//true
		System.out.println(c1 instanceof D);//false
		
	}

}
