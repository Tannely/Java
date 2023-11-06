package Lab5;
import java.util.Scanner;
public class lab5 {
    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int counter = 0; // починаємо з лічильника 0
boolean pin_code_coincided = false; // починаємо з false, оскільки ще не відомо, чи співпаде пін-код
while (counter < 5) { // 5 спроб
String correct = sc.nextLine();
String vasya = sc.nextLine();
counter++;
if (correct.equals(vasya)) {
System.out.println("CORRECT");
pin_code_coincided = true;
break;
} else {
System.out.println("INCORRECT " + counter); // пробіл після INCORRECT
}
}
if (!pin_code_coincided) {
System.out.println("Error");
}
}
}

    
