package calculator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculations {

    public void add(Scanner sc){
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = numOne + numTwo;
        System.out.println("The answer is " + answer);
    }

    public void subtract(Scanner sc){
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = numOne - numTwo;
        System.out.println("The answer is " + answer);
    }

    public void multiply(Scanner sc){
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = numOne * numTwo;
        System.out.println("The answer is " + answer);
    }

    public void divide(Scanner sc){
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = numOne / numTwo;
        System.out.println("The answer is " + answer);
    }

    public void powerOf(Scanner sc) {
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = Math.pow(numOne, numTwo);
        System.out.println("The answer is " + answer);
    }

    public void divideRemainder(Scanner sc){
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = numOne % numTwo;
        System.out.println("The answer is " + answer);
    }

    public void percent(Scanner sc){
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = numOne / numTwo * 100;
        System.out.println("the answer is " + answer + "%");
    }

    public void percent2(Scanner sc){
        double numOne = getDouble(sc, "Enter a number");
        double numTwo = getDouble(sc, "Enter another number");
        double answer = numOne * numTwo / 100;
        System.out.println("the answer is " + answer + "%");
    }

    public void average(Scanner sc){
        List<Double> numbers = new ArrayList<>();
        System.out.println("Enter numbers. Enter any letter to stop");
        while(sc.hasNextDouble()){
            numbers.add(sc.nextDouble());
        }
        double answer = numbers.stream()
                            .mapToDouble(a -> a)
                            .average()
                            .orElse(Double.NaN);
        System.out.println("The average is " + answer);
    }

    private static double getDouble(Scanner sc, String prompt){
        System.out.println(prompt);
        while(!sc.hasNextDouble()){
            sc.next();
        }
        return sc.nextDouble();
    }
}
