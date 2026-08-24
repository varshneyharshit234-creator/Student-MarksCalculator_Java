package project;

import java.util.Scanner;

public class Loan_Eligibility_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter an age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        int income = sc.nextInt();

        System.out.print("Enter credit score: ");
        int credit = sc.nextInt();

        sc.nextLine();

        System.out.println("Existing loan (yes/no):");
        String loan = sc.nextLine();

        if(age >= 21 && age <= 60){
            if (income >= 25000){
                if (credit > 700){
                    if (loan.equals("no") ){
                        System.out.println("Lone approved !");
                        System.out.println("Congratulations " + name );
                    }
                    else {
                        System.out.println("Loan: Rejected !");
                        System.out.println("Reason: you have a loan");
                    }
                }
                else {
                    System.out.println("Loan: Rejected !");
                    System.out.println("Reason: credit is below 700.");
                }
            }
            else {
                System.out.println("Loan: Rejected !");
                System.out.println("Reason: age is below 21.");
            }
        }
    }
}
