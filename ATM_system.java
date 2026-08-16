package project;

import java.util.Scanner;

public class ATM_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your pin:");
        int pin = sc.nextInt();

        if(pin == 1602){
            System.out.println("Login Successful!");

            int total = 50000;
            System.out.println("Current Balance is ₹50,000");

            System.out.println("What do you want to do?");
            System.out.println("WITHDRAW");
            System.out.println("DEPOSIT");
            sc.nextLine();

            String method = sc.nextLine();


            if  (method.equals("withdraw")) {
                System.out.println("Enter withdraw amount:");
                int amount_for_withdraw = sc.nextInt();

                int after_withdraw = total - amount_for_withdraw;

                if(after_withdraw >= 0 ){
                    System.out.println("Remaining amount is " + "₹"+ after_withdraw );
                }
                else {
                    System.out.println("Insufficient balence !");
                }
            }
            else if (method.equals("deposit")){
                System.out.println("Enter deposit amount:");
                int amount_for_deposit = sc.nextInt();

                int after_deposit = total + amount_for_deposit;

                System.out.println("amount after deposit is " + "₹" + after_deposit);

            }
            else {
                System.out.println("Invalid option!");
            }

        }
        else {
            System.out.println("Incorrect password");
        }


    }
}
