package phase1.project;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{
		int a, b;
		char operator;
		double result = 0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a= sc.nextInt();
		System.out.println("Enter the second number");
		b= sc.nextInt();
		System.out.println("Enter the  operation which needs to be done");
		operator= sc.next().charAt(0);
		
		switch (operator)
		{
		case '+' : result = a+b;
		           break;
		case '-' : result = a-b;
	               break;
		case '*' : result = a*b;
		           break;
		case '/' : result = a/b;
		           break;
		           
		}
		System.out.println(a+" "+operator+" "+b+ " "+ result);
		
		
		
	}
	
}


