import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Function Understanding

        // int first = input.nextInt();
        // int second = input.nextInt();
        // int sum = printName(first, second);
        // System.out.println("Sum of 2 number is :- " + sum);
        // int sum_2 = printName(first, second);
        // System.out.println("Sum of 2 number is :- " + sum_2);

        // Pass by value

        // int age = 18;
        // doSomething(age);
        // System.out.println(age);

        // Pass by Reference

        int age = 18;
        doSomething(age);
        System.out.println(age);
    }

    // Function Understanding Part

    // public static int printName(int first, int second) {
    // int sum_1 = (first + second);
    // return sum_1;
    // }

    // Pass by value Part

    // public static void doSomething(int age) {
    // if (age >= 18) {
    // age++;
    // System.out.println(age);
    // } else {
    // age--;
    // System.out.println(age);
    // }
    // }

    // Pass by Reference Part

    public static void doSomething(int age) {
        if (age >= 18) {
            age++;
            System.out.println(age);
        } else {
            age--;
            System.out.println(age);
        }
    }

}
