package array;

public class LaunchAA {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int key = 30;
		
		for(int i=0; i<a.length; i++) {
			if(key == a[i]) {
				System.out.println("Key found in collection at index: "+i);
				System.exit(0);
			}
		}
		System.out.println("Key not found");
	}

}
