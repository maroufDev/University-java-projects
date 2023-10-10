import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        printInfo(4);

        Scanner scanner = new Scanner(System.in);

        print("Number of rows: ");
        int rowsNum = scanner.nextInt();

        for (int i = 1; i <= rowsNum; i++) {
            println("");
            for (int k = 0; k < rowsNum - (i - 1); k++) {
                print(" ");
            }
            for (int j = 0; j < i; j++) {
                print("* ");
            }
        }
    }

    public static void printInfo(int exerciseNumber) {
        System.out.println("Ali Marouf");
        System.out.println("exercise "  + exerciseNumber + "\n--------------\n");
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }
}