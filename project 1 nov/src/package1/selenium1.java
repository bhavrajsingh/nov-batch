package package1;

public class selenium1 extends automation1
{
	public selenium1()
	{this(7,70);
		System.out.println("child default constructor");
		}
	public selenium1(int a)
	{this(4,9,7,4);
		System.out.println("child one parametrized constructor");
		}
	public selenium1(int a,int b)
	{super(7);
		System.out.println("child two parametrized default constructor");
		}
	public selenium1(int a,int b,int c)
	{this(5);
		System.out.println("child three parametrized default constructor");
		}
	public selenium1(int a,int b,int c, int d)
	{this();
		System.out.println("child four parametrized default constructor");
		}
	public static void main(String[] args) 
	{
		selenium1 obj = new selenium1(5,6,7);
		
	}
}
