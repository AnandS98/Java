package string;

public class LaunchStr1 {

	public static void main(String[] args) {
		String str = "Anand";
		String str1 = new String("Anand");
		String str2 = "Anand";
		String str3 = new String("Anand");
		System.out.println(str==str2);
		System.out.println(str==str1);
		System.out.println(str1==str3);
	}

}
