package array;
import java.util.Scanner;

public class LaunchArr {

	public static void main(String[] args) {
		int []a = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<5; i++) {
			System.out.println("Please enter the marks of "+(i+1)+": ");
			a[i]=scan.nextInt();
		}
		System.out.println("The marks of student are as follows");
		for(int i=0; i<5; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
