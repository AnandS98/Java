package operators;

public class operators1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Logical AND (&&)
        if (a < b && b < c) {
            System.out.println("Both conditions are true");
        }

        // Logical OR (||)
        if (a > b || b < c) {
            System.out.println("At least one condition is true");
        }

        // Logical NOT (!)
        boolean isTrue = true;
        if (!isTrue) {
            System.out.println("This will not be printed");
        } else {
            System.out.println("This will be printed");
        }
    }
}
