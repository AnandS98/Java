package oop;

class calculator{
    int a;
    int b;

    public int add(){
        System.out.print("Add a number: ");
        return a+b;
    }
}

public class classes1 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.a=10;
        calc.b=20;
        System.out.println(calc.add());
    }
    
}
