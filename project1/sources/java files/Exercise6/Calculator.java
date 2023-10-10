public class Calculator {

    int result = 0;

    public void plus(int... nums) {
        for (int args : nums) {
            result += args;
        }
        System.out.println(result);
        result = 0;
    }

    public void plus(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

}
