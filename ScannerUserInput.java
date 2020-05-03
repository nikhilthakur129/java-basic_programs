package userInput;
import java.util.Scanner;


public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float principal=sc.nextFloat();
		float rate=sc.nextFloat();
		int time = sc.nextInt();
		float simpleinterest=principal*time*rate/100;
		System.out.print(simpleinterest);
	}

}
