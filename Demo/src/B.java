
public class B extends A{
	public B()
	{
		System.out.println("In Default of B");
	}
	public B (int a)
	{
		super(100);
		System.out.println("In Parameterized of B"+a);
		
	}
	public static void main(String[]args) {
		B b=new B(10);
	}
}

