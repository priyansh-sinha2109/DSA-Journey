import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Problem 1

        // System.out.println("Welcome to if-else practice");
        // int age = input.nextInt();
        // if (age >= 18) {
        // System.out.println("You are adult");
        // } else {
        // System.out.println("You are not adult");
        // }

        // Problem 2

        // System.out.println("Welcome to practice complex!..");
        // int marks = input.nextInt();
        // if (marks < 25) {
        // System.out.println("F");
        // } else if (marks <= 44) {
        // System.out.println("E");
        // } else if (marks <= 49) {
        // System.out.println("D");
        // } else if (marks <= 59) {
        // System.out.println("C");
        // } else if (marks <= 79) {
        // System.out.println("B");
        // } else if (marks <= 100) {
        // System.out.println("A");
        // }

        // Problem 3

        int age = input.nextInt();
        if (age < 18) {
            System.out.println("Not eligible for job");
        } else if (age <= 57) {
            System.out.println("eligible for job");
            if (age >= 55) {
                System.out.println(", But retirement Soon"); // nested if else
            }
        } else if (age > 57) {
            System.out.println("Retirement time");
        }
    }
}
