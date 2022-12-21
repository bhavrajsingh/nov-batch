package package1;

public class airthmetic2 
{
public int mul(int a,int b)////(((((10*2)-2)+2)-2)/2)
{
return a*b;
}
public int sub (int a,int b)
{
	return a-b;
}
public int add (int a,int b)
{
	return a+b;
	}
public int div (int a,int b)
{
	return a/b;
}
public static void main(String[] args) {
	airthmetic2 obj = new airthmetic2();
	int mul = obj.mul(10, 2);
	int sub = obj.sub(mul, 2);
	int sum = obj.add(sub,2);
	int subs = obj.sub(sum, 2);
	int div = obj.div(subs, 2);
	System.out.println("final value = "+div);
}
}