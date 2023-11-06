import java.util.Arrays;
public class Lab3_1_3 {
    /*В одновимірному масиві, що складається з дійсних елементів, 
    обчислити мінімальний елемент масиву; суму елементів масиву, 
    розташованих між першим і останнім додатними елементами. Перетворити масив таким чином, 
    щоб спочатку розташовувалися всі елементи рівні нулю, а потім − всі інші */
    public static void main(String[] args) {
        double[] arr = {5.0, -3.4, 8.7, 5.1, 0.0, -6.2, 3.1, 0.0, 2.5};
        
        // Знаходимо мінімальний елемент масиву
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Мінімальний елемент масиву: " + min);
        
        // Знаходимо суму елементів між першим і останнім додатними елементами
        int start = -1, end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (start == -1) {
                    start = i;
                } else {
                    end = i;
                }
            }
        }
        double sum = 0.0;
        if (start != -1 && end != -1) {
            for (int i = start + 1; i < end; i++) {
                sum += arr[i];
            }
        }
        System.out.println("Сума елементів між першим і останнім додатними: " + sum);
        
        // Перетворюємо масив таким чином, щоб спочатку розташовувалися всі елементи рівні нулю, а потім - всі інші
        double[] newArr = new double[arr.length];
        int zeroIndex = 0, otherIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                newArr[zeroIndex] = arr[i];
                zeroIndex++;
            } else {
                newArr[otherIndex] = arr[i];
                otherIndex--;
            }
        }
        System.out.println("Перетворений масив: " + Arrays.toString(newArr));
    }
}

