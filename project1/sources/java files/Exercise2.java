import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        printInfo(2);

        Scanner scanner = new Scanner(System.in);

        print("Enter x: ");
        int x = scanner.nextInt();
        println(function(x));
    }

    public static float function(int x) {
        return (float) (1 / (Math.pow(x, 2) + x + 3));
    }
    
    public static void printInfo(int exerciseNumber) {
        System.out.println("Ali Marouf");
        System.out.println("exercise " + exerciseNumber + "\n--------------\n");
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }
}