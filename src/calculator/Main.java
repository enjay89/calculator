package calculator;

import java.util.Scanner;

public class Main {

    private static Calculations calculations;

    public static void main(String[] args) {
        calculations = new Calculations();
        Scanner sc = new Scanner(System.in);
        run(sc);
    }

    private static void run(Scanner sc) {
        while(true) {
            printOptions();
            int choice = getUserChoice(sc,"Enter a number, retard");
            if (choice == 0){
                break;
            }
            if (choice == 1) {
                calculations.add(sc);
            } else if (choice == 2) {
                calculations.subtract(sc);
            } else if (choice == 3) {
                calculations.multiply(sc);
            } else if (choice == 4) {
                calculations.divide(sc);
            } else if (choice == 5) {
                calculations.powerOf(sc);
            } else if (choice == 6) {
                calculations.divideRemainder(sc);
            } else if (choice == 7) {
                calculations.percent(sc);
            } else if (choice == 8) {
                calculations.average(sc);
            } else if (choice ==9) {
                calculations.percent2(sc);
            } else {
                System.out.println("Invalid choice, please choose again");
            }
        }
    }

    private static void printOptions() {
        System.out.println();
        System.out.println("Press 1 to add");
        System.out.println("Press 2 to subtract");
        System.out.println("Press 3 to multiply");
        System.out.println("Press 4 to divide");
        System.out.println("Press 5 to raise number to the power of other");
        System.out.println("Press 6 to divide and find the remainder");
        System.out.println("Press 7 to get the percentage one number is of another i.e express 'a' as a % of 'b'");
        System.out.println("Press 8 to get the average of a set of a numbers");
        System.out.println("Press 9 to get a percentage of a number e.g 50% of 75");
        System.out.println("Press 0 to quit");
    }

    private static int getUserChoice(Scanner sc, String prompt){
        while(!sc.hasNextInt()){
            System.out.println(prompt);
            sc.next();
        }
        return sc.nextInt();
    }
}
