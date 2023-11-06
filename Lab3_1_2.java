public class Lab3_1_2 {
/*Напишіть програму, що заміняє всі елементи заданого масиву, 
крім крайніх, на півсуму сусідніх, і друкує результат.*/
        public static void main(String[] args) {
            int[] arr = {2, 4, 5, 8, 1}; // заданий масив
            
            for (int i = 1; i < arr.length - 1; i++) {
                arr[i] = (arr[i-1] + arr[i+1]) / 2; // заміна елементу на півсуму сусідніх
            }
            
            // виведення масиву на екран
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    
}
