import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial: ");
		
		int num = sc.nextInt();
		
		int factorial = 1;
		
		for(int i=num; i>=1; --i) {
			
			
			factorial = factorial * i;
			
		}
		
		System.out.println("The factorial of number " + num + " is " + factorial);
		
		sc.close();
	}

}
