import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs
        int[] dimensions = getInput(scanner);

        // Calculate area
        int area = calculateArea(dimensions[0], dimensions[1]);

        // Display result
        displayOutput(area);
    }

    public static int[] getInput(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        return new int[]{length, width};
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void displayOutput(int area) {
        System.out.println("The area of the rectangle is: " + area);
    }
}
