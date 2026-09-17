import java.util.Arrays;
import java.util.Scanner;

public class week5 {
    public static void main(String[] args) {
        class Student {
            String name;
            int score;
        }
        Student first = new Student();
        first.name = "김민준";
        first.score = 88;
        Student second = new Student();
        second.name = "이서연";
        second.score = 95;

        System.out.println(first);
        System.out.println(second);
    }
}