package section_1;

import java.util.Scanner;

public class ScannerClass {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("The sum is " + c);
    }
}
