package operators;
import java.util.Scanner;
public class ArithenaticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*a+b*b+2*a*b;
		System.out.print(c);
	}

}
