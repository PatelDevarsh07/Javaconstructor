package j4constructor;

class math{
	private int a=10;
	private int b=20;
	
	public void printdata()
	{
		System.out.println("A=>"+a+"B=>"+b);
	}
	math()
	{
	  a=5;
	  b=10;		
	}
	math(int x,int y)
	{
	  a=x;
	  b=y;
	}
}
public class maths {

	public static void main(String[] args) {
    math m1=new math();
    math m2=new math(34,23);
    math m3=new math(11,20);
    
    m1.printdata();
    m2.printdata();
    m3.printdata();
	}
}
