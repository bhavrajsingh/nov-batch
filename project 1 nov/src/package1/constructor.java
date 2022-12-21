package package1;

public class constructor {
public constructor() 
{
	this(3,9,6);
	System.out.println("defaut constructor");
	System.out.println("updation to chk git");
}
public constructor(int a) 
{
	this();
	System.out.println("one parameterized constructor");
}
public constructor(int a,int b) 
{
	this(9);
	System.out.println("two parametrized constructor");
}
public constructor(int a,int b,int c) 
{
	
	System.out.println("three parameterized constructor");
}
public constructor(int a,int b,int c,int d) 
{
	this(3,2);
	System.out.println("four parameterized constructor");
}
public static void main(String[] args) {
	constructor ref = new constructor(33,24,9,8);
	//constructor ref2 = new constructor(2);
}
}
//3,default,1,2,4