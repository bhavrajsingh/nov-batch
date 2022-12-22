package package1;

public class airthmatic {
public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
	}
public int sub(int d,int e)
{
	int f;
	
	f=d-e;
	System.out.println("sub result is "+f);
	return f;
	}
public void mul(int g,int h)
{
  int i;
  i=g*h;
  System.out.println("mul result is "+i);
	}
public static void main(String[] args) {
	airthmatic bhavraj=new airthmatic();    //object creation
	bhavraj.sum(5, 5);
	bhavraj.sub(5, 5);
	bhavraj.mul(5, 5);
}
}
