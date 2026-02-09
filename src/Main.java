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
        double doubleModulo = 0.00;

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
        doubleModulo = doubleOperandB % doubleOperandA; // Assignment uses % operator for modulo (remainder)

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference using ints of " + intOperandB + " and " + intOperandA + " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandB + " and " + intOperandA + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandB + " and " + intOperandA + " is " + intModulo);
        System.out.println(); // add a space for readability
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference using doubles of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleDifference);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleQuotient);
        System.out.println("The modulo using doubles of " + doubleOperandB + " and " + doubleOperandA + " is " + doubleModulo);
        System.out.println(); // add a space for readability

        // the number of kids in your family:
        int kidsInFamily = 3;
        System.out.println("There are " + kidsInFamily + " kids in my family.");
        // the answer to is it raining?:
        boolean isRaining = false;
        System.out.println("Is it raining? " + isRaining);
        // the price of a gallon of gas:
        double gasPrice = 4.20;
        System.out.println("The price of gas is: " + gasPrice);
        // your favorite number:
        int favNumber = 13;
        System.out.println("My favorite number is: " + favNumber);
        // your shoe size:
        double shoeSize = 11.5;
        System.out.println("My show size is: " + shoeSize);
        // your birth month:
        int birthMonth = 1;
        System.out.println("My birth month is: " + birthMonth);
        // your full name:
        String fullName = "Charles Moore";
        System.out.println("My name is: " + fullName);



    }
}