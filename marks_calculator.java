package project;

import java.util.Scanner;

public class marks_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter an student name:");
        String name = sc.nextLine();

        System.out.println("Hindi marks: ");
        int m1 = sc.nextInt();
        System.out.println("English marks: ");
        int m2 = sc.nextInt();
        System.out.println("Math marks: ");
        int m3 = sc.nextInt();

        int total = 300;
        int total_obtain = m1 + m2 + m3;
        System.out.println(total_obtain);


        double percentage = (total_obtain * 100) / total;
        System.out.println("Percentage: " + percentage + "%");

        if(percentage >= 90 ){
            System.out.println("A+");
        } else if (percentage >= 80) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("B");
        } else if (percentage >= 60) {
            System.out.println("C");
        } else if (percentage >= 50) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }


    }

}
