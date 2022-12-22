package package1;

public final class airthmatic1 {
public int sum(int a,int b) //(((((10+2)+2)-2)*2)/2)
{
	return a+b;
	}
public int sub(int a,int b)
{
	return a-b;
	}
public int mul(int a,int b)
{
	return a*b;
	}
public int div(int a,int b)
{
	return a/b;
	}
public static void main(String[] args)
{
	airthmatic1 finalvalue = new airthmatic1();
	int initialsum = finalvalue.sum(10, 2);
	int finalsum = finalvalue.sum(initialsum, 2);
	int sub = finalvalue.sub(finalsum, 2);
	int mul = finalvalue.mul(sub, 2);
	int div = finalvalue.div(mul, 2);
	System.out.println("final value = "+div);
}

}
