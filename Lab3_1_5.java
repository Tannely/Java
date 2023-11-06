public class Lab3_1_5 {
    /*В одновимірному масиві, що складається з дійсних елементів, обчислити добуток 
    додатних елементів масиву; суму елементів масиву, розташованих до мінімального елемента. 
    Упорядкувати за зростанням окремо елементи, що розташовані на парних місцях, і елементи, 
    що розташовані на непарних місцях. */

        public static void main(String[] args) {
            double[] arr = { -2.5,  3.9, -9.4,  4.7};
            int n = arr.length;
    
            double positiveProduct = 1.0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    positiveProduct *= arr[i];
                }
            }
            System.out.println("Добуток додатних елементів: " + positiveProduct);
    
            double sum = 0.0;
            int minIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            for (int i = 0; i < minIndex; i++) {
                sum += arr[i];
            }
            System.out.println("Сума елементів до мінімального: " + sum);
    
            for (int i = 0; i < n; i += 2) {
                for (int j = i + 2; j < n; j += 2) {
                    if (arr[i] > arr[j]) {
                        double temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = 1; i < n; i += 2) {
                for (int j = i + 2; j < n; j += 2) {
                    if (arr[i] > arr[j]) {
                        double temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Масив, відсортований за зростанням на парних і непарних місцях:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
