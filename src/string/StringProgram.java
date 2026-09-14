package string;

public class StringProgram {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;

        System.out.println(str3); // Output: Hello World

        // String methods
        System.out.println("Length of str3: " + str3.length()); // Output: 11
        System.out.println("Uppercase: " + str3.toUpperCase()); // Output: HELLO WORLD
        System.out.println("Lowercase: " + str3.toLowerCase()); // Output: hello world
        System.out.println("Substring (0, 5): " + str3.substring(0, 5)); // Output: Hello
        System.out.println("Index of 'World': " + str3.indexOf("World")); // Output: 6
        System.out.println(str3.hashCode());
        System.out.println(str3.charAt(7));
        System.out.println(str3.concat(" Anand"));
    }
}