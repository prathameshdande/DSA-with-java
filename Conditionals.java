import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int dailyCode = 12;
        // if(dailyCode >= 10){
        // System.out.println("Good practice");
        // }

        // int age = 15;
        // if(age >= 18){
        // System.out.println("You are eligible for voting...!");
        // }else{
        // System.out.println("You are not eligible for voting...!");
        // }

        // if else if ladder

        int accuracy = 91;
        if (accuracy >= 90) {
            System.out.println("Excellent");
        } else if (accuracy >= 75) {
            System.out.println("Good");
        } else if (accuracy >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Need Improvement");
        }

        int day = 8;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        System.out.println("Now I reached at line number 46");

        // nested if-else
        boolean hasSubscription = true;
        int solvedProblems = 150;

        if (hasSubscription) {
            if (solvedProblems >= 100) {
                System.out.println("You have unlocked DSA sheet");
            } else {
                System.out.println("You have need to solve at 100 problems");
            }
        } else {
            System.out.println("Upgrade to premium");
        }

        boolean passport = true;
        int age = 19;

        if (passport) {
            System.out.println("You are eligible to go to USA");
            if (age >= 18) {
                System.out.println("You are eligible for working part time jobs in USA");
            } else {
                System.out.println("Make sure your age must be equal or above 18");
            }
        } else {
            System.out.println("You are not eligible to go to USA");
        }

        // ternary operator

        int snapStreak = 100;

        String status = (snapStreak >= 100) ? "Pro User" : "Normal user";

        System.out.println("Snapchat status : " + status);

        // Switch case
        // System.out.println("Enter any number for your wellness: ");
        // int character = sc.nextInt();

        // switch (character) {
        //     case 1:
        //         System.out.println("Aye tu ja re");
        //         break;

        //     case 2:
        //         System.out.println("Abhi tak gya nahi tu....?");
        //         break;

        //     case 3:
        //         System.out.println("Abe sale");
        //         break;

        //     case 4:
        //         System.out.println("Chauka mar diya");
        //         break;

        //     default:
        //     System.out.println("Fahhhh");
        // }


        //Assignment 
        // 1) take the i/p and print if she/he is eligible for voting or not
        
        // int ageForVoting = sc.nextInt();
        // if(ageForVoting >= 18){
        //     System.out.println("You are eligible for voting...!");
        // }else{
        //     System.out.println("You are not eligible for voting...!");
        // }

        //2) take 5 sub marks and print overall percentage of the students

        double percentage;
        int sum = 0;
        for(int i = 1; i<=5; i++){
            System.out.print("Enter the marks for subject: ");
            int marks = sc.nextInt();
            sum+=marks;
        }

        percentage = (sum/500.0)*100;

        if (percentage >= 90) {
            System.out.println("Excellent with marks :" + percentage);
        } else if (accuracy >= 75) {
            System.out.println("Good with marks :" + percentage);
        } else if (accuracy >= 60) {
            System.out.println("Average with marks :" + percentage);
        } else {
            System.out.println("Need Improvement with marks :" + percentage);
        }
    }
}
