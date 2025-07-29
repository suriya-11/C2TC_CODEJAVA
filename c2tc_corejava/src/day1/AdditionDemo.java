package day1;
import java.util.Scanner;
public class AdditionDemo {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = a+b;
		System.out.print(c);

	}

}
