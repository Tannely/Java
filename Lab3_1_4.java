public class Lab3_1_4 {
    /*В одновимірному масиві, що складається з цілих елементів, 
    обчислити номер максимального елемента масиву; 
    добуток елементів масиву, розташованих між першим і другим нульовими елементами. 
    Перетворити масив таким чином, щоб у першій його половині розташовувалися елементи,
     що стояли на непарних позиціях, а в другій половині − елементи, що стояли на парних позиціях.*/

        public static void main(String[] args) {
            int[] arr = {5, 7, 0, 3, 9, 2, 0, 1, 4};
            int n = arr.length;
    
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            System.out.println("Номер максимального елемента: " + maxIndex);
    
            int product = 1;
            int firstZeroIndex = -1;
            int secondZeroIndex = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    if (firstZeroIndex == -1) {
                        firstZeroIndex = i;
                    } else {
                        secondZeroIndex = i;
                        break;
                    }
                }
            }
            if (firstZeroIndex != -1 && secondZeroIndex != -1) {
                for (int i = firstZeroIndex + 1; i < secondZeroIndex; i++) {
                    product *= arr[i];
                }
            }
            System.out.println("Добуток елементів між першим і другим нульовими елементами: " + product);
    
            int[] newArr = new int[n];
            int oddIndex = 0;
            int evenIndex = n / 2;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    newArr[evenIndex] = arr[i];
                    evenIndex++;
                } else {
                    newArr[oddIndex] = arr[i];
                    oddIndex++;
                }
            }
            System.out.println("Перетворений масив: ");
            for (int i = 0; i < n; i++) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
    