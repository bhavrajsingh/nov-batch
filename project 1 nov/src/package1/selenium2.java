package package1;

import java.util.Scanner;

public class selenium2 
{
	public int sum(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
		
	}
	public int mul(int a,int b) {
		return a*b;
		
	}
	public int div(int a,int b) {
		return a/b;
		
	}
	
public static void main(String[] args) {
	selenium2 finalvalue = new selenium2();

	System.out.println("plz enter value of x1");        //(((((x1+x2)+x3)-x4)*x5)/x6)          ((((x1*x2)-x3)+x4)-x5)/x6)
	Scanner obj = new Scanner(System.in);
	 int x1 = obj.nextInt();
	// System.out.println("value of a = "+x1);
	 System.out.println("plz enter value of x2");
	 int x2 = obj.nextInt();
	 //System.out.println("value of f = "+x2);
	 System.out.println("enter value of x3");
	 int x3 = obj.nextInt();
	 System.out.println("enter value of x4");
	 int x4 = obj.nextInt();
	 System.out.println("enter value of x5");
	 int x5 = obj.nextInt();
	 System.out.println("enter value of x6");
	 int x6 = obj.nextInt();
	 int initialmul = finalvalue.mul(x1,x2);
	 int finalsub = finalvalue.sub(initialmul, x3);
	 int sum = finalvalue.sub(finalsub, x4);
	 int totalsub = finalvalue.mul(sum, x5);
	 int div = finalvalue.div(totalsub, x6);
	 System.out.println("final value = "+div);
	 
	// int finalvalue = (((((x1+x2)+x3)-x4)*x5)/x6);
	 
	 //System.out.println("final value = "+finalvalue);
}
}
