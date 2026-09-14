package string;

public class StringBufferCode {
    //Used to create mutable string objects. StringBuffer is synchronized, so it is thread-safe. It is slower than StringBuilder.
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Anand");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Sachan");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(3, "Java");
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb);
    }
}
