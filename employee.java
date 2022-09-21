package j4constructor;

class emp
{
	private int eno;
	private String ename;
	private int salary;
	
	public void printdata()
	{
		System.out.println("Employee number=>"+eno+"Employee name=>"+ename+"Salary=>"+salary);
	}
	emp()
	{
		eno=001;
		ename="dev";
		salary=50000;
	}
	emp(int n,String e,int s)
	{
		eno=n;
		ename=e;
		salary=s;
	}
}
public class employee {

	public static void main(String[] args) {
		emp e1=new emp();
		emp e2=new emp(002,"het",40000);
		
		e1.printdata();
		e2.printdata();
	}
}
