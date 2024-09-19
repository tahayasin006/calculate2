import java.util.Scanner;

public class calc2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number :");
        double num1 = scan.nextDouble();
        System.out.print("Enter Second Number :");
        double num2 = scan.nextDouble();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Choose Your Process :");
        int select = scan.nextInt();

        switch (select) {

            case 1:
                System.out.println("Total :" + (num1 + num2));

                break;

            case 2:

                System.out.println("Result :" + (num1 - num2));
                break;

            case 3:

                System.out.println("Result :" + (num1 * num2));
                break;

            case 4:

                if (num2 != 0) {

                    System.out.println("Result :" + (num1 / num2));
                } else {
                    System.out.println("A Number is Not Divisible By Zero...");
                }
                    break;
            default:
                System.out.println("You Made A Mistake!!!");

        }
    }
}
