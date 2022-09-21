package j4constructor;
import java.util.Scanner;

class student
{
	private int no;
	private String name;
	
	public void print()
	{
		System.out.println("Number=> "+no+"|"+"Name=> "+name);
	}
	student()
	{
		no=101;
		name="dev";
	}
}
class markss extends student
{
	protected int h;
	protected int e;
	
	public void print()
	{
		super.print();
		System.out.println("Result is=> "+(h+e));
	}
	markss()
	{
		h=99;
		e=99;
	}
}
class result extends markss
{
	public void print()
	{
		super.print();
		System.out.println("Result is=> "+(h+e));
	}
}	
public class stdwithoutarg {

	public static void main(String[] args) {
		
	       result r1=new result();
	       r1.print();
	}
}
