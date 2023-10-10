import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printInfo(1);

        int workTime;
        int incomePerHour;

        print("Enter work time: ");
        workTime = scanner.nextInt();

        print("Enter income per hour: ");
        incomePerHour = scanner.nextInt();


        println("Salary without deduction of tax: " + (workTime * incomePerHour));
        println("Salary with deduction of tax: " + ((workTime * incomePerHour) * 0.9));

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
