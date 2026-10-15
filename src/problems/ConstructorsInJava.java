package problems;

class Human2 {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Human2(int age, String name) {
            this.age = age;
            this.name = name;
        }  
        
    }

public class ConstructorsInJava {

    public static void main (String[] args) {
        Human2 h = new Human2(30, "Anand");
        System.out.println(h.getName()+" "+h.getAge());
    }
    
}
