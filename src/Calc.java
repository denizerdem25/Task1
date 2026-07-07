import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = menu();

        double num1, num2 = 0, res = 0;
        while (ch != 7) {
            switch (ch) {
                case 1:
                    System.out.print("Enter number 1: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = sc.nextDouble();
                    res = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter number 1: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = sc.nextDouble();
                    res = num1 - num2;
                    break;
                case 3:
                    System.out.print("Enter number 1: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = sc.nextDouble();
                    res = num1 * num2;
                    break;
                case 4:
                    System.out.print("Enter number 1: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = sc.nextDouble();
                    if(num2 != 0)
                      res = num1 / num2;
                    else{
                        System.out.println("Result : Division by 0!!\n" );
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    res = Math.sqrt(num1);
                    break;
                case 6:
                    System.out.print("Enter number 1: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = sc.nextDouble();
                    res = Math.pow(num1, num2);
                    break;
            }
            if((ch == 4 && num2 != 0 )|| (ch != 4))
                System.out.println("Result : " + res + "\n");
            ch = menu();
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tMENU");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square root");
        System.out.println("6. Power");
        System.out.println("7. EXIT");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        while (ch < 1 || ch > 7) {
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
        }
        return ch;
    }
}
