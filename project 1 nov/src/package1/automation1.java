package package1;

public class automation1 {
public automation1()
{
	this(3,4,1);
	System.out.println("parent default constructor");
	}
public automation1(int a)
{this(4,3);
	System.out.println("parent one paramerized constructor");
	}
public automation1(int a, int b )
{
	this(2,8,9,5);
	System.out.println("parent two parametrized constructor");
	}
public automation1(int a,int b,int c)
{
	
	System.out.println("parent three parametrized constructor");
	}
public automation1(int a,int b,int c,int d)
{
	this();
	System.out.println("parent four parametrized constructor");
	}
}
