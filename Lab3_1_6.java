import java.util.Arrays;
public class Lab3_1_6 {
    /*В одновимірному масиві, що складається з дійсних елементів, обчислити кількість
     елементів масиву, що лежать у діапазоні від А до В; суму елементів масиву, розташованих 
     після максимального елемента. Упорядкувати елементи масиву за спаданням модулів елементів.*/


         public static void main(String[] args) {
             
             double[] arr = {2.5, 3.6, 1.2, -4.3, 5.1, -3.7, 0.9};
             double a = -2.0;
             double b = 3.0;
             
             int count = 0; // кількість елементів в діапазоні [a, b]
             double sum = 0; // сума елементів після максимального
             int maxIndex = 0; // індекс максимального елемента
             
             // знаходимо кількість елементів в діапазоні [a, b]
             for (double num : arr) {
                 if (num >= a && num <= b) {
                     count++;
                 }
             }
             
             // знаходимо максимальний елемент та його індекс
             double max = arr[0];
             for (int i = 1; i < arr.length; i++) {
                 if (arr[i] > max) {
                     max = arr[i];
                     maxIndex = i;
                 }
             }
             
             // знаходимо суму елементів після максимального
             for (int i = maxIndex + 1; i < arr.length; i++) {
                 sum += arr[i];
             }
             
             // сортуємо масив за спаданням модулів елементів
             Arrays.sort(arr, (a1, b1) -> Double.compare(Math.abs(b1), Math.abs(a1)));
            
             
             // виводимо результати
             System.out.println("Кількість елементів в діапазоні [" + a + ", " + b + "]: " + count);
             System.out.println("Сума елементів після максимального: " + sum);
             System.out.println("Масив, упорядкований за спаданням модулів елементів: " + Arrays.toString(arr));
         }
     }
     


