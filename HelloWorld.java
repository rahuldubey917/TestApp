package ForGit;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
		
		System.out.println("enter second num");
		int b=sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("a: " + a + "\nb:" + b);
		System.out.print("Hello world, this is a java program");
		sc.close();
	}

}
