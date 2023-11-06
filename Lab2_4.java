import java.util.Scanner;
public class Lab2_4 {
    public static void main(String[] args) {
     
		System.out.print("Еnter a number greater than 0: ");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1; i<= n; i++){
			sum = sum + i;
		}
		System.out.println ("Sum = "+sum);		
	}
}



