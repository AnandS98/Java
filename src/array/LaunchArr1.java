package array;
import java.util.Scanner;

public class LaunchArr1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[3][4];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter Marks of class: "+(i+1)+" Student: "+(j+1));
				arr[i][j]=scan.nextInt();			}
		}
		System.out.println("Marks of student are: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
