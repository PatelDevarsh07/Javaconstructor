package j4constructor;

class std
{
	private int no;
	private String sname;
	private int hindi;
	private int english;
	
	std()
	{
		no=001;
		sname="dev";
		hindi=66;
		english=78;
	}
	std(int a,String b,int h,int e)
	{
		no=a;
		sname=b;
		hindi=h;
		english=e;
	}
	public void printdata()
	{
		System.out.println("Number=>"+no+"Name=>"+sname+"Hindi marks=>"+hindi+"English marks=>"+english);
	}	
}
public class marks {

	public static void main(String[] args) {
	
		std s1=new std();
		std s2=new std(002,"het",35,55);
        s1.printdata();
        s2.printdata();
	}
}
