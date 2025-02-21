package array;

public class LaunchForEach2 {

	public static void main(String[] args) {

		int arr[][] = {{10,20,30,40},{10,20,30}};
		for(int ar[]:arr) {
			for(int element:ar) {
				System.out.println(element);
			}
		}
	}

}
