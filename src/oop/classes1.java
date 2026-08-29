package oop;

class calculator{

    public int add(int num1, int num2){
        System.out.print("Add a number: ");
        return num1+num2;
    }

    public int sub(int num1, int num2){
        System.out.print("Sub a number: ");
        return num1-num2;
    }

    public int mul(int num1, int num2){
        System.out.print("Mul a number: ");
        return num1*num2;
    }

    public int div(int num1, int num2){
        System.out.print("Div a number: ");
        return num1/num2;
    }
}

public class classes1 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(10,20));
        System.out.println(calc.sub(20, 10));
        System.out.println(calc.mul(10,20));
        System.out.println(calc.div(20, 10));
    }
    
}
