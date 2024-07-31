package Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students students = new Students("Aditya", 78.34f);
        Students students1 = new Students("Arpit", 89.45f);
        Students students2 = new Students("Dushyant", 56.45f);
        Students students3 = new Students("Akhil", 95.45f);
        Students students4 = new Students("Himanshu", 99.45f);
        Students students5 = new Students("Nakul", 67.45f);

        Students[] list = {students, students1, students2, students3, students4, students5};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if (students.compareTo(students1) <0){
            System.out.println("Aditya is loser");
        }
    }
}
