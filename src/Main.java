import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int intOperandA = 2;
        int intOperandB = 5;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 3.50; // This is a declaration and initial assignment
        double doubleOperandB = 5.25;
        double doubleSum = 0.00;
        double doubleProduct = 0.00;
        double doubleDifference = 0.00;
        double doubleQuotient = 0.00;

        // Create declarations and output strings for each:
        // + - * / %
        // Create a complete sentence output statement that displays the results

        intSum = intOperandA + intOperandB; // Assignment uses arithmetic operator + for addition
        intDifference = intOperandB - intOperandA; // Assignment uses arithmetic operator - for subtraction
        intProduct = intOperandA * intOperandB; // Assignment uses arithmetic operator * for multiplication
        intQuotient = intOperandB / intOperandA; // Assignment uses arithmetic operator / for division
        intModulo = intOperandB % intOperandA; // Assignment uses % operator for modulo (remainder)

        doubleSum = doubleOperandA + doubleOperandB; // Assignment uses arithmetic operator + for addition
        doubleDifference = doubleOperandB - doubleOperandA; // Assignment uses arithmetic operator - for subtraction
        doubleProduct = doubleOperandA * doubleOperandB; // Assignment uses arithmetic operator * for multiplication
        doubleQuotient = doubleOperandB / doubleOperandA; // Assignment uses arithmetic operator / for division

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference using ints of " + intOperandB + " and " + intOperandA + " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandB + " and " + intOperandA + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandB + " and " + intOperandA + " is " + intModulo);

        System.out.println();

        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference using doubles of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleQuotient);


    }
}