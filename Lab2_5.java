import java.util.Scanner;
public class Lab2_5 {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int n = 0;
        do
        {
            System.out.println("Enter first number: ");
            int num1 = in.nextInt();
            System.out.println("Enter second number: ");
            int num2 = in.nextInt();
            System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
 
            System.out.println("To exit the program, press the number 1, to continue any other number");
            n = in.nextInt();
        }
        while(n!=1);
        in.close();
    }
}
