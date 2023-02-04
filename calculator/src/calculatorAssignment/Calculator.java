package calculatorAssignment;

import java.util.Scanner;

interface ArithmeticCalculator{

    int cube(int val1);
    default int square(int val){
        return val*val;
    }

    default int add(int val1, int val2){
        return (val1 + val2);
    }

    static int sub(int val1, int val2){
        return (val2 - val1);
    }

    static int mul(int val1, int val2){
        return val1*val2;
    }

    static int div(int val1, int val2){
        return (val1/val2);
    }
}
public class Calculator implements ArithmeticCalculator{

    public int cube(int val){
        return (val*val*val);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Calculator calculatorObject = new Calculator();


        System.out.print("Enter number to get the cube value: ");
        int cubeInput = sc.nextInt();
        int cubeOutput = calculatorObject.cube(cubeInput);

        System.out.println("The cube of " + cubeInput + " is: " + cubeOutput);

        System.out.print("Enter number to get the square value: ");
        int squareInput = sc.nextInt();
        int squareOutput = calculatorObject.square(squareInput);

        System.out.println("The square of " + squareInput + " is: " + squareOutput);

        System.out.print("Enter numbers to get the sum");
        int sumInput1 = sc.nextInt();
        int sumInput2 = sc.nextInt();
        int sumOutput = calculatorObject.add(sumInput2, sumInput1);

        System.out.println("The difference of " + sumInput2 + " and " + sumInput1 + " is: " + sumOutput);

        System.out.print("Enter numbers to get the difference:");
        int differenceInput1 = sc.nextInt();
        int differenceInput2 = sc.nextInt();
        int differenceOutput = ArithmeticCalculator.sub(differenceInput2, differenceInput1);

        System.out.println("The sum of " + differenceInput1 + " and " + differenceInput2 + " is: " + differenceOutput);

        System.out.print("Enter numbers to get the product:");
        int productInput1 = sc.nextInt();
        int productInput2 = sc.nextInt();
        int productOutput = ArithmeticCalculator.mul(productInput2, productInput1);

        System.out.println("The product of " + productInput1 + " and " + productInput2 + " is: " + productOutput);

        System.out.print("Enter numbers to get the division:");
        int divisionInput1 = sc.nextInt();
        int divisionInput2 = sc.nextInt();
        int divisionOutput = ArithmeticCalculator.div(divisionInput1, divisionInput2);

        System.out.println("The product of " + divisionInput1 + " and " + divisionInput2 + " is: " + divisionOutput);
    }
}
