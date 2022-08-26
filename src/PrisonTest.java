//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class PrisonTest {
    static Prisoner p01;
    static Prisoner p02;
    public static void main(String[] args){
        p01 = new Prisoner("Bubba", 2.08, 4);
        p02 = new Prisoner();
        printFields();
        printFields(true);
    }

    public static void printFields(){
        System.out.println(p01.name + "\n" +p01.height + "\n" +p01.sentence);
        System.out.println();
        System.out.println(p02.name + "\n" +p02.height + "\n" +p02.sentence);
    }

    public static void printFields(boolean check) {
        if (check) {
            p01.think();
        }
    }
}
