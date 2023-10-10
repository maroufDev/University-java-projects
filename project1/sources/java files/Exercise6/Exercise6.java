public class Exercise6 {
    public static void main(String[] args) {

        printInfo(6);

        Calculator calculator = new Calculator();

        calculator.plus(5, 11, 6);
        calculator.plus(10, 5);
        calculator.minus(10, 5);
        calculator.multiply(10, 5);
        calculator.divide(10, 5);
    }

    public static void printInfo(int exerciseNumber) {
        System.out.println("Ali Marouf");
        System.out.println("exercise " + exerciseNumber + "\n--------------\n");
    }
}