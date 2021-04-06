package com.company;
import java.util.Scanner;

class intro {
    void introduction() {                                      // bank intro
        System.out.println();
        System.out.println();
        System.out.println("                              ********* HELLO ! WELCOME TO POONIA BANK ! *********");
        System.out.println("                                                 Grow with us ");
        System.out.println();
    }

    void choice1Filling() {                                      // to avail atm services
        System.out.println();
        System.out.println("    # What service would you like to avail ? # ");
        System.out.println("    # 1. Cash Withdrawl / ATM ?  (Press 1)");
        System.out.println("    # 2. Banking Services ? (Press 2)");
        System.out.print("   Enter : ");
        Scanner sc1 = new Scanner(System.in);
        int choice1 = sc1.nextInt();
        if (choice1 == 1) {
            System.out.println("     # THANK YOU ! For choosing Cash Withdrawl .");
            System.out.println("       Are you ready to enter ATM portal :");
            System.out.println("        If 'Yes' Enter '1' and press 'ENTER'");
            System.out.println("        If 'No'  Enter '2' and press 'ENTER'");
            int  choiceYN = sc1.nextInt();
            if(choiceYN == 1){
                atmAccountNo();
                takingInfoAccountNo();
                atmPassword();
            }
            else if(choiceYN == 2){
                choice1Filling();
            }
            else {
                System.out.println("          Enter valid choice :)");
                choice1Filling();
            }
        } else if (choice1 == 2) {
            System.out.println("    # THANK YOU ! For choosing Banking related services ! ");
            services  s = new services();
            s.loan();
        } else {
            System.out.println("      *****");
            System.out.println("       Enter valid choice !");
            System.out.println("      *****");
            choice1Filling();
        }
    }


    void atmAccountNo() {
        System.out.println();
        System.out.println();
        System.out.println("             ############ WELCOME TO THE ATM PORTAL ############# ");
        System.out.println();
        System.out.print("       # Enter your bank account number : ");
    }

    void takingInfoAccountNo() {
        Scanner sc2 = new Scanner(System.in);
        int accountNo = sc2.nextInt();
    }

    void atmPassword() {
        System.out.print("       # Enter your password : ");
        Scanner sc3 = new Scanner(System.in);
        int password = sc3.nextInt();
        System.out.println();
        System.out.println("        %%% Account Balance is : $100000 %%%");
        System.out.println();
        System.out.print("   Enter the amount you want to withdraw : $");
        int amount = sc3.nextInt();
        System.out.println();
        System.out.println("       ##### Take the money from the counter ! THANK YOU !");
    }
}
class services{
    void loan(){
        System.out.println();
        System.out.println();
        System.out.println("          ####### WELCOME TO THE LOAN PORTAL ########");
        System.out.println();
        System.out.println("     Select the loan category you want to go for : ");
        System.out.println("      1. Home Loan\n      2. Car loan ");
        Scanner sc4 = new Scanner(System.in);
        int loanChoice = sc4.nextInt();
        if(loanChoice == 1){
            homeLoan();
        }
        else if(loanChoice == 2){
            carLoan();
        }
        else{
            System.out.println("      ******");
            System.out.println("        Enter Valid Choice :)");
            System.out.println("      ******");
            loan();
        }
    }
    void carLoan(){
        System.out.println("   $$$$$$  WELCOME TO THE CAR LOAN PORTAL  $$$$$$$");
        System.out.println();
        System.out.print("    Enter your name : ");
        Scanner sc5 = new Scanner(System.in);
        String name = sc5.nextLine();
        System.out.println();
        int bankBalance = 100000;
        System.out.println("    "+name+" , Your Bank Balance is : " +bankBalance);
        System.out.print("    Enter your job profile : ");
        String job = sc5.nextLine();
        System.out.println();
        System.out.print("    Which car are you willing to buy : ");
        String carname = sc5.nextLine();
        System.out.println();
        System.out.print("    Enter the loan amount : ");
        int amount = sc5.nextInt();
        System.out.println();
        if(amount < bankBalance){
            System.out.println("                     Your account seems full of money ");
            System.out.println("               $$  OK . Your loan have been approved . $$ ");
        }
        else {
            System.out.println("      Sorry ! You aren't rich enough to have this loan :(");
        }
    }
    void homeLoan(){
        System.out.println("      WELCOME TO THE HOME LOAN PORTAL  ");
        System.out.println();
        System.out.print("      Enter your name : ");
        Scanner sc6 = new Scanner(System.in);
        String  name = sc6.nextLine();
        System.out.println();
        int balance = 1000000;
        System.out.println("      Hello "+name+" , Your bank balance is : "+balance);
        System.out.println();
        System.out.print("       "+name+" How much amount would you like to apply for Loan ?  : ");
        int amount = sc6.nextInt();
        if (amount < balance){
            System.out.println("      "+name+" ,  We think you are trustable to have this loan :)  of amount : "+amount);
            System.out.println();
            System.out.println("                           $$$  CONGRATULATIONS  $$$");
        }
        else{
            System.out.println("       Your are too poor to have this loan :)");
        }
    }
}

public  class PooniaBank {
    public static void main(String args[]) {
        intro intro1 = new intro();
        System.out.println("commited..");
        intro1.introduction();
        intro1.choice1Filling();


    }
}
