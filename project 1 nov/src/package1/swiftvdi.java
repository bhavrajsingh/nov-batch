package package1;

public class swiftvdi extends swift
{
public void m3()
{
	System.out.println("i am super child");
	}
public static void main(String[] args) {
	swiftvdi obj = new swiftvdi();
	obj.m1();
	obj.m2();
	obj.m3();
	obj.price=8;
	System.out.println(obj.price);
}
}
