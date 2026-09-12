package oop;

class Computer {
    public void playMusic() {
        System.out.println("Playing music...");
    }
    public String getMeAPen(int cost) {
        if(cost>10) 
            return "Pen";
        return "No Pen";
    }
}

public class classes2 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(11);
        System.out.println(str);

    }
}
