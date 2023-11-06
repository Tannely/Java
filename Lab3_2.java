import java.util.ArrayList;
import java.util.List;
/*Знайти неперервні ділянки, на яких сума елементів дорівнює 0. 
Розмірність масиву 300 в діапазоні від -100 до 100 java */
public class Lab3_2 {


    public static void main(String[] args) {
        int[] arr = new int[300]; // заданий масив
        List<int[]> subArrays = new ArrayList<>(); // список для зберігання неперервних ділянок
        
        // заповнення масиву випадковими числами в діапазоні [-100, 100]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201 - 100);
        }
        
        // пошук неперервних ділянок з сумою елементів 0
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    subArrays.add(java.util.Arrays.copyOfRange(arr, i, j+1));
                }
            }
        }
        
        // виведення результатів
        if (subArrays.isEmpty()) {
            System.out.println("У масиві немає неперервних ділянок з сумою елементів, що дорівнює 0.");
        } else {
            System.out.println("Неперервні ділянки з сумою елементів, що дорівнює 0:");
            for (int[] subArray : subArrays) {
                System.out.println(java.util.Arrays.toString(subArray));
            }
        }
    }
}

    

