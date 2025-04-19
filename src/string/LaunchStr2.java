package string;

public class LaunchStr2 {

	public static void main(String[] args) {
		String s1 = "Alien";
		String s2 = "alien";
		String s3 = new String("Alien");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
	}

}
