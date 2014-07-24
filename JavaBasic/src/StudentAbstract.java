
public abstract class StudentAbstract {

	
	public abstract void method1();
	
	{
		System.out.println("Abstract1");
	}
	public abstract void method2();
	{
		System.out.println("Abstract 2");
	}
	public void run()
	{
		System.out.println("Non Abstract");
	}
	
	public static void main(String[] args) {

		StudentAbstract n=new StudentAbstract();
		n.method1();
		
	}

}
