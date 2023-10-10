import java.util.Scanner;

// Written by Ali Marouf

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[10];

        while (true) {
            System.out.print("Enter number (-1 to quit):");
            int a = scanner.nextInt();

            if (a == -1) {
                break;
            } else {
                try {
                    array[a]++;
                } catch (Exception e) {
                    System.out.println("You Should Enter a single digit number :)");
                }
            }
        }

	System.out.println();

        for (int i = 0; i <= 9; i++) {
            System.out.print(i + ": " + array[i] + " times \n");
        }
    }
}
