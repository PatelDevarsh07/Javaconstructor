package j4constructor;

class stud
{
	private int a;
	private String name;
	
	public void print()
	{
		System.out.println("Enrollment=> "+a+"|"+"Name=> "+name);
	}
	stud(int x,String y)
	{
		a=x;
		name=y;
		System.out.println("In student");
	}
}
class mark extends stud
{
	protected int hindi;
	protected int english;
	
	public void print()
	{
		super.print();
		System.out.println("hindi=> "+hindi+"|"+"english=> "+english);
	}
	mark(int x,String y,int m,int n)
	{
		super(x,y);
		hindi=m;
		english=n;
		
		System.out.println("In mark");
	}
}
class results extends mark
{
	results(int x,String y,int m,int n)
	{
		super(x,y,m,n);
		System.out.println("Result is=> "+(hindi+english));
	}
}
public class stdwitharg {

	public static void main(String[] args) {

		results r1=new results(1,"ram",22,33);
		r1.print();
	}
}
